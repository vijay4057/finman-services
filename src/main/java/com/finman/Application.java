package com.finman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableAutoConfiguration
@EnableWebMvc
@ComponentScan(basePackages = {"com.finman.config", "com.finman.login"})
public class Application extends WebMvcAutoConfiguration {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}
