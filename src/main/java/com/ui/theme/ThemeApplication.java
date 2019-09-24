package com.ui.theme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author admin
 */
@SpringBootApplication
public class ThemeApplication {

    public static void main(String[] args) {
        System.setProperty("server.port", "8081");
        SpringApplication.run(ThemeApplication.class, args);
    }
}
