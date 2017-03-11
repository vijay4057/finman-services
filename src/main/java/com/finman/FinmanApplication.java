package com.finman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * Entry class for the project
 * @author Superuser
 *
 */
public class FinmanApplication{
    
    /**
     * Main method for Application to start the server
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        SpringApplication.run(FinmanApplication.class, args);
    }
    
    
}
