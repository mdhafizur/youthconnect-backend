package com.chemnitz.youthconnect

import AuthMiddleware
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.*
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.service.Contact
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import java.util.*
import java.util.logging.Logger

@SpringBootApplication(exclude = [SecurityAutoConfiguration::class])
class YouthconnectApplication

fun main(args: Array<String>) {
    runApplication<YouthconnectApplication>(*args)
}

@EnableWebMvc
@Configuration
class WebMvcConfig : WebMvcConfigurer {
    private val logger = Logger.getLogger(WebMvcConfig::class.java.name)

    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/**")
            .allowedOrigins("http://localhost:3000")
            .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
            .allowedHeaders("*")
            .allowCredentials(true) // Optional, use if you need credentials
            .maxAge(3600) // Optional, set the maximum age for pre-flight requests cache
    }

    override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
        registry.addResourceHandler("/swagger-ui.html")
            .addResourceLocations("classpath:/META-INF/resources/")

        registry.addResourceHandler("/webjars/**")
            .addResourceLocations("classpath:/META-INF/resources/webjars/")
    }

    override fun addInterceptors(registry: InterceptorRegistry) {
        try {
            registry.addInterceptor(AuthMiddleware())
                // Exclude paths related to authentication
                .excludePathPatterns("/auth/**")
                // Add pattern to intercept all other paths
                .addPathPatterns("/**")
        } catch (e: Exception) {
            logger.warning("Error registering AuthMiddleware interceptor: ${e.message}")
        }
    }
}

@Configuration
class SpringFoxConfig {
    @Bean
    fun api(): Docket {
        return Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.any())
            .paths(PathSelectors.any())
            .build()
            .apiInfo(getApiInfo())
    }

    private fun getApiInfo(): ApiInfo {
        return ApiInfo(
            "Youthconnect Api",
            "Map Api",
            "1",
            "TERMS OF SERVICE URL",
            Contact("Md Hafizur Rahman", "URL", "hafizur.upm@gmail.com"),
            "LICENSE",
            "LICENSE URL",
            Collections.emptyList()
        )
    }
}
