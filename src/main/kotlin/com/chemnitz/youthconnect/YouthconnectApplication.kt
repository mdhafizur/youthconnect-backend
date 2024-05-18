package com.chemnitz.youthconnect

import com.chemnitz.youthconnect.middlewares.AuthMiddleware
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket


@SpringBootApplication(exclude = [SecurityAutoConfiguration::class])
class YouthconnectApplication

fun main(args: Array<String>) {
	runApplication<YouthconnectApplication>(*args)
}


@Configuration
class WebMvcConfig : WebMvcConfigurer {

	override fun addCorsMappings(registry: CorsRegistry) {
		registry.addMapping("/**")
			.allowedOrigins("http://localhost:3000")
			.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
			.allowedHeaders("*")
			.allowCredentials(true) // Optional, use if you need credentials
			.maxAge(3600) // Optional, set the maximum age for pre-flight requests cache
	}

	override fun addInterceptors(registry: InterceptorRegistry) {
		registry.addInterceptor(AuthMiddleware())
			.addPathPatterns("/api/**")
			.excludePathPatterns("/api/auth/**")
	}

	override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
		registry.addResourceHandler("swagger-ui.html")
			.addResourceLocations("classpath:/META-INF/resources/")

		registry.addResourceHandler("/webjars/**")
			.addResourceLocations("classpath:/META-INF/resources/webjars/")
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
	}
}

