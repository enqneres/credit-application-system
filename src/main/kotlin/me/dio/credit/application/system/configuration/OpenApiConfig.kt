package me.dio.credit.application.system.configuration

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class OpenApiConfig {

    @Bean
    fun customOpenAPI(): OpenAPI {
        return OpenAPI()
            .info(
                Info()
                    .title("Customer & Credit API")
                    .description("API REST para gerenciamento de clientes e créditos")
                    .version("1.0.0")
            )
    }
}