package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * A Spring Boot alkalmazás belépési pontja.
 * Ez az osztály tartalmazza a main metódust, amely a Spring Boot alkalmazást indítja el.
 */
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}