package com.example.crudspring.angula.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudSpringAngulaApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudSpringAngulaApiApplication.class, args);
    }

    /* public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/greeting-javaconfig").allowedOrigins("http://localhost:4200");
            }
        };
    }
    */
}
