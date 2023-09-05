package com.example.mainmodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class MainModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainModuleApplication.class, args);
    }

}
