package com.grantmagdanz.rest.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by grantmagdanz on 2/26/17.
 */
@SpringBootApplication
@ComponentScan("com.grantmagdanz.rest")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
