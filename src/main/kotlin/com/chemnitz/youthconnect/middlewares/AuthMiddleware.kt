import io.jsonwebtoken.ExpiredJwtException
import io.jsonwebtoken.Jwts
import org.springframework.stereotype.Component
import org.springframework.web.servlet.HandlerInterceptor
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import java.util.*

@Component
class AuthMiddleware : HandlerInterceptor {

    private val secretKey = "secret"

    override fun preHandle(request: HttpServletRequest, response: HttpServletResponse, handler: Any): Boolean {
        // Extract token from cookie
        val cookies = request.cookies
        val tokenCookie = cookies?.find { it.name == "token" }
        val token = tokenCookie?.value

        // Check if the token is valid
        if (isValidToken(token)) {
            return true
        } else {
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized")
            return false
        }
    }

    private fun isValidToken(token: String?): Boolean {
        try {
            if (token == null) {
                return false
            }

            // Parse the token
            val claims = Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token)


            val expiration = claims.body.expiration
            val now = Date()
            if (expiration != null && expiration.before(now)) {
                return false // Token has expired
            }

            // If all checks pass, the token is considered valid
            return true
        } catch (e: ExpiredJwtException) {
            // Token has expired
            return false
        } catch (e: Exception) {
            // Other exceptions
            return false
        }
    }
}
