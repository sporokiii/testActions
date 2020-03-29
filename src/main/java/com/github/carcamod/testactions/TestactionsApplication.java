package com.github.carcamod.testactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestactionsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestactionsApplication.class, args);
        System.out.println("Test github action on push D");
    }

}
