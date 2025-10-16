package com.senai.infob.teste.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Schedulestudy",
        version = "1.0",
        description = "E-mail para contato: sophia.m.almeida6@aluno.senai.br"
    )
)
public class Swagger {

}
