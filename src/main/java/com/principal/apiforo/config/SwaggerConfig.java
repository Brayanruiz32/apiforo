package com.principal.apiforo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "API CLUBES",
                description = "Our app provides a concise listing of football team names",
                termsOfService = "www.unprogramadornace.com/terminos_y_condiciones",
                version = "1.0.0",
                contact = @Contact(
                        name = "Santiago Perez",
                        url = "https://unprogramadornace.com",
                        email = "santy@mail.com"
                ),
                license = @License(
                        name = "Standard Software Use License for UnProgramadorNace",
                        url = "www.unprogramadornace.com/licence"
                )
        ),
        security = @SecurityRequirement(
                name = "Security Token"
        )
)

@SecurityScheme(
        name = "Security Token",
        description = "Access Token For My API",
        type = SecuritySchemeType.HTTP,
        paramName = HttpHeaders.AUTHORIZATION,
        in = SecuritySchemeIn.HEADER,
        scheme = "bearer",
        bearerFormat = "JWT"
)
public class SwaggerConfig {
}
