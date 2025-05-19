package com.example.controller;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example", "com.example.manager"}) // Add the package of StudentManager here
@EntityScan(basePackages = "com.example.entity")
@EnableJpaRepositories(basePackages = "com.example.repository")  // Make sure this points to the correct repository package
public class HireApplication {
    public static void main(String[] args) {
        SpringApplication.run(HireApplication.class, args);
    }
}
