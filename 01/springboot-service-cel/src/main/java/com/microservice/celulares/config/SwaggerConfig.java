package com.microservice.celulares.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.models.Contact;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket apiDocket() {

        return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.microservice.celulares.controllers"))
            .paths(PathSelectors.any())
            .build()
            .apiInfo(getApiInfo());

    }

	private ApiInfo getApiInfo() {
        return new ApiInfo("Celulares",
                           "Servicio para venta de celulares",
                           "1.0.0",
                           "Terminos de servicios",
                           "Adrian",
                           "LICENSE",
                           "LICENSE URL");
	}
}
