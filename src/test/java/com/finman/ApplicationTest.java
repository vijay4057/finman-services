package com.finman;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class) // Spring Junit Class for executing test cases
@ContextConfiguration(classes = {FinmanApplication.class}) // Mandatory to check which configuration classes to test
@WebAppConfiguration // Added because the Configuration classes like {Application.class,WebMvcConfig.class} may contains @EnableWebMvc. If you add the @EnableWebMvc it requires ServletContext. So added this annotation
@SpringBootTest
public class ApplicationTest {

    @Test
    public void contextLoads() {

    }
}
