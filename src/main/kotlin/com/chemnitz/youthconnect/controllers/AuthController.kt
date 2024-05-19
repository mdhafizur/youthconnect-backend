package com.chemnitz.youthconnect.controllers

import com.chemnitz.youthconnect.dtos.LoginDTO
import com.chemnitz.youthconnect.dtos.Message
import com.chemnitz.youthconnect.dtos.RegisterDTO
import com.chemnitz.youthconnect.models.User
import com.chemnitz.youthconnect.services.UserService
import io.jsonwebtoken.ExpiredJwtException
import io.jsonwebtoken.Jwts
import io.jsonwebtoken.SignatureAlgorithm
import jakarta.servlet.http.HttpServletResponse
import jakarta.servlet.http.Cookie
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.web.bind.annotation.*
import java.security.SignatureException
import java.util.*


@RestController
@RequestMapping("auth")
class AuthController(private val userService: UserService) {

    private val secretKey = "secret"

    @PostMapping("register")
    fun register(@RequestBody body: RegisterDTO): ResponseEntity<User> {
        val plainPassword = body.password
        val encodedPassword = BCryptPasswordEncoder().encode(plainPassword)
        val user = User(body.email, encodedPassword);
        return ResponseEntity.ok(this.userService.createUser(user))
    }

    @PostMapping("login")
    fun login(@RequestBody body: LoginDTO, response: HttpServletResponse): ResponseEntity<Any> {
        val user = this.userService.getUserByEmail(body.email)
            ?: return ResponseEntity.badRequest().body(Message("user not found!"))

        if (!user.comparePassword(body.password)) {
            return ResponseEntity.badRequest().body(Message("invalid password!"))
        }

        val subject = user._id.toString()

        val token = Jwts.builder()
            .setSubject(subject)
            .setExpiration(Date(System.currentTimeMillis() + 60 * 24 * 1000)) // 1 day
            .signWith(SignatureAlgorithm.HS512, secretKey).compact()

        val cookie = Cookie("token", token)
        cookie.isHttpOnly = true
        cookie.path = "/api"
        cookie.secure = true
        response.setHeader("Set-Cookie", "$cookie; SameSite=Lax") // Set SameSite to Lax

        response.addCookie(cookie)

        return ResponseEntity.ok(Message("success"))
    }

    @GetMapping("user")
    fun user(@CookieValue("token") token: String?): ResponseEntity<Any> {
        try {
            if (token == null) {
                return ResponseEntity.status(401).body(Message("unauthenticated"))
            }

            val claims = Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token)
            val userId = claims.body.subject

            val user = userService.getUserById(userId)

            if (user.status != "active") {
                return ResponseEntity.status(401).body(Message("unauthenticated"))
            }

            return ResponseEntity.ok(user)
        } catch (e: ExpiredJwtException) {
            return ResponseEntity.status(401).body(Message("expired token"))
        } catch (e: SignatureException) {
            return ResponseEntity.status(401).body(Message("invalid token signature"))
        } catch (e: Exception) {
            return ResponseEntity.status(401).body(Message("unauthenticated"))
        }
    }

    @PostMapping("logout")
    fun logout(response: HttpServletResponse): ResponseEntity<Any> {
        val cookie = Cookie("token", "")
        cookie.isHttpOnly = true
        cookie.path = "/api"
        cookie.secure = true
        cookie.maxAge = 0
        response.setHeader("Set-Cookie", "$cookie; SameSite=Lax") // Set SameSite to Lax

        response.addCookie(cookie)

        return ResponseEntity.ok(Message("success"))
    }
}
