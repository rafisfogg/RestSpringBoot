package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {
            "com.example.cliente"
            })
@EnableJpaRepositories(basePackages = {
            "com.example.repository"
            })

public class ApiNctApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiNctApplication.class, args);
    }

}