package com.finman;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class) // Spring Junit Class for executing test cases
@ContextConfiguration(classes = {Application.class}) // Mandatory to check which configuration classes to test
@WebAppConfiguration // Added because the Configuration classes like {Application.class,WebMvcConfig.class} may contains @EnableWebMvc. If you add the @EnableWebMvc it requires ServletContext. So added this annotation
public class ApplicationTest {

    @Test
    public void contextLoads() {

    }
}