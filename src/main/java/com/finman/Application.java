package com.finman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.finman"})

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
     * To Load index Page
     * @return
     */
    @RequestMapping("/")
    public String loadIndex(){
        return "index";
    }

    /**
     * Main method for Application to start the server
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
    
    
}
