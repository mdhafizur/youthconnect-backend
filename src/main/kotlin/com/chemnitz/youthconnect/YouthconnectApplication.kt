package com.chemnitz.youthconnect
import AuthMiddleware
import org.springframework.beans.BeansException
import org.springframework.beans.factory.config.BeanPostProcessor
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.*
import org.springframework.web.servlet.mvc.method.RequestMappingInfoHandlerMapping
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.service.Contact
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.spring.web.plugins.WebMvcRequestHandlerProvider
import java.lang.reflect.Field
import java.util.*
import java.util.logging.Logger
import java.util.stream.Collectors

@EnableWebMvc
@SpringBootApplication(exclude = [SecurityAutoConfiguration::class])
class YouthconnectApplication

fun main(args: Array<String>) {
    runApplication<YouthconnectApplication>(*args)
}



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

    override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
        registry.addResourceHandler("swagger-ui.html")
            .addResourceLocations("classpath:/META-INF/resources/")

        registry.addResourceHandler("/webjars/**")
            .addResourceLocations("classpath:/META-INF/resources/webjars/")
    }
}



@Configuration
class SwaggerConfig {
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
            "Api Usuarios",
            "prueba global logic",
            "1",
            "TERMS OF SERVICE URL",
            Contact("Gabriel Hernández", "URL", "gabriel.hernandez.u@gmail.com"),
            "LICENSE",
            "LICENSE URL",
            Collections.emptyList()
        )
    }

    @Bean
    fun springfoxHandlerProviderBeanPostProcessor(): BeanPostProcessor {
        return object : BeanPostProcessor {
            @Throws(BeansException::class)
            override fun postProcessAfterInitialization(bean: Any, beanName: String): Any? {
                if (bean is WebMvcRequestHandlerProvider) {
                    customizeSpringfoxHandlerMappings(getHandlerMappings(bean))
                }
                return bean
            }

            private fun customizeSpringfoxHandlerMappings(mappings: MutableList<RequestMappingInfoHandlerMapping>) {
                val copy = mappings.stream()
                    .filter { mapping -> mapping.patternParser == null }
                    .collect(Collectors.toList())
                mappings.clear()
                mappings.addAll(copy)
            }

            private fun getHandlerMappings(bean: Any): MutableList<RequestMappingInfoHandlerMapping> {
                try {
                    val field: Field = bean.javaClass.getDeclaredField("handlerMappings")
                    field.isAccessible = true
                    return field.get(bean) as MutableList<RequestMappingInfoHandlerMapping>
                } catch (e: IllegalArgumentException) {
                    throw IllegalStateException(e)
                } catch (e: IllegalAccessException) {
                    throw IllegalStateException(e)
                }
            }
        }
    }
}