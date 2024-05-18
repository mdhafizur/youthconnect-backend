package com.chemnitz.youthconnect.middlewares

import org.springframework.stereotype.Component
import org.springframework.web.servlet.HandlerInterceptor
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse

@Component
class AuthMiddleware : HandlerInterceptor {
    override fun preHandle(request: HttpServletRequest, response: HttpServletResponse, handler: Any): Boolean {
        // Extract token from cookie
        val cookies = request.cookies
        val tokenCookie = cookies?.find { it.name == "jwt" }
        val token = tokenCookie?.value

        // Example: Check if the token is valid
        if (isValidToken(token)) {
            return true
        } else {
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized")
            return false
        }
    }

    private fun isValidToken(token: String?): Boolean {
        // Implement your token validation logic
        return token != null
    }
}
