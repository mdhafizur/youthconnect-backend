package com.chemnitz.youthconnect.controllers

import com.chemnitz.youthconnect.dtos.LoginDTO
import com.chemnitz.youthconnect.dtos.Message
import com.chemnitz.youthconnect.dtos.RegisterDTO
import com.chemnitz.youthconnect.dtos.UpdateUserDTO
import com.chemnitz.youthconnect.models.User
import com.chemnitz.youthconnect.services.UserService
import io.jsonwebtoken.ExpiredJwtException
import io.jsonwebtoken.Jwts
import io.jsonwebtoken.SignatureAlgorithm
import jakarta.servlet.http.HttpServletResponse
import jakarta.servlet.http.Cookie
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.security.SignatureException
import java.util.*


@RestController
@RequestMapping("auth")
class AuthController(private val userService: UserService) {

    private val secretKey = "secret"

    @PostMapping("register")
    fun register(@RequestBody body: RegisterDTO): ResponseEntity<User> {
        val existingUser = userService.getUserByEmail(body.email)

        return if (existingUser != null) {
            if (existingUser.status == "deleted") {
                val updateUserDTO = UpdateUserDTO(
                    existingUser._id, existingUser.email, body.password, "active", null, null
                )
                ResponseEntity.ok(userService.updateUser(updateUserDTO._id!!, updateUserDTO))
            } else {
                // User already exists and is active
                ResponseEntity.status(HttpStatus.CONFLICT).body(null) // Or handle differently as needed
            }
        } else {
            val user = User(email = body.email)
            user.setPassword(body.password)
            val createdUser = userService.createUser(user)
            ResponseEntity.status(HttpStatus.CREATED).body(createdUser)
        }
    }


    @PostMapping("login")
    fun login(@RequestBody body: LoginDTO, response: HttpServletResponse): ResponseEntity<Any> {
        val user = userService.getUserByEmail(body.email) ?: return ResponseEntity.status(HttpStatus.NOT_FOUND)
            .body(Message("User not found"))

        if (!user.comparePassword(body.password)) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Message("Invalid password"))
        }

        val token = Jwts.builder()
            .setSubject(user._id.toString())
            .claim("issuedAt", Date())
            .claim("issuer", "YouthConnect")
            .setExpiration(Date(System.currentTimeMillis() + 60 * 24 * 1000)) // 1 day
            .signWith(SignatureAlgorithm.HS512, secretKey).compact()

        val cookie = Cookie("token", token)
        cookie.isHttpOnly = true
        cookie.path = "/api"
        cookie.secure = true
        response.setHeader("Set-Cookie", "$cookie; SameSite=None") // Set SameSite to Lax

        response.addCookie(cookie)
        return ResponseEntity.status(HttpStatus.OK).body(Message("Login successful"))
    }

    @GetMapping("user")
    fun getUser(@CookieValue("token") token: String?): ResponseEntity<Any> {
        return try {
            if (token == null) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Message("Token is null"))
            }

            val claims = Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token)
            val userId = claims.body.subject

            val user = userService.getUserById(userId)
            if (user.status != "active") {
                ResponseEntity.status(HttpStatus.NOT_FOUND).body(Message("User not found"))
            } else {
                ResponseEntity.ok(user)
            }
        } catch (e: ExpiredJwtException) {
            ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Message("Expired token"))
        } catch (e: SignatureException) {
            ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Message("Invalid token signature"))
        } catch (e: Exception) {
            ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Message("Unauthenticated"))
        }
    }

    @PostMapping("logout")
    fun logout(response: HttpServletResponse): ResponseEntity<Any> {
        val cookie = Cookie("token", "")
        cookie.isHttpOnly = true
        cookie.path = "/api"
        cookie.secure = true
        response.setHeader("Set-Cookie", "$cookie; SameSite=None") // Set SameSite to Lax

        response.addCookie(cookie)
        return ResponseEntity.status(HttpStatus.OK).body(Message("Logout successful"))
    }
}
