package com.finman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

@Controller
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.finman.config", "com.finman.login"})

/**
 * Entry class for the project
 * @author Superuser
 *
 */
public class Application{
    
    /**
     * Default private Constructor
     */
    private Application(){}

    /**
     * Main method for Application to start the server
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}
