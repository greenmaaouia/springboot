package com.tecnilogica.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {

	// Este comentario se añade dentro de: jgitflow:release-start

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
