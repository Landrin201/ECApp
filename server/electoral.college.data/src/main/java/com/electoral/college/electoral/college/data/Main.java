package com.electoral.college.electoral.college.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
