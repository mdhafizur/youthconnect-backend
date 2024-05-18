package com.chemnitz.youthconnect.controllers

import com.chemnitz.youthconnect.dtos.LoginDTO
import com.chemnitz.youthconnect.dtos.Message
import com.chemnitz.youthconnect.dtos.RegisterDTO
import com.chemnitz.youthconnect.models.User
import com.chemnitz.youthconnect.services.UserService
import io.jsonwebtoken.Jwts
import io.jsonwebtoken.SignatureAlgorithm
import jakarta.servlet.http.HttpServletResponse
import jakarta.servlet.http.Cookie
import org.springframework.http.ResponseEntity
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.web.bind.annotation.*
import java.util.*


@RestController
@RequestMapping("/auth")
class AuthController(private val userService: UserService) {

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

        val issuer = user._id.toString()

        val jwt = Jwts.builder()
            .setIssuer(issuer)
            .setExpiration(Date(System.currentTimeMillis() + 60 * 24 * 1000)) // 1 day
            .signWith(SignatureAlgorithm.HS512, "secret").compact()

        val cookie = Cookie("jwt", jwt)
        cookie.isHttpOnly = true
        cookie.path = "/api"
        cookie.secure = true
        response.setHeader("Set-Cookie", "$cookie; SameSite=Lax") // Set SameSite to Lax

        response.addCookie(cookie)

        return ResponseEntity.ok(Message("success"))
    }

    @GetMapping("user")
    fun user(@CookieValue("jwt") jwt: String?): ResponseEntity<Any> {
        try {
            if (jwt == null) {
                return ResponseEntity.status(401).body(Message("unauthenticated"))
            }

            val body = Jwts.parser().setSigningKey("secret").parseClaimsJws(jwt).body
            val userId = body.issuer

            val user = userService.getUserById(userId)

            if (user.status != "active") {
                return ResponseEntity.status(401).body(Message("unauthenticated"))
            }

            return ResponseEntity.ok(user)
        } catch (e: Exception) {
            return ResponseEntity.status(401).body(Message("unauthenticated"))
        }
    }

    @PostMapping("logout")
    fun logout(response: HttpServletResponse): ResponseEntity<Any> {
        val cookie = Cookie("jwt", "")
        cookie.maxAge = 0

        response.addCookie(cookie)

        return ResponseEntity.ok(Message("success"))
    }
}
