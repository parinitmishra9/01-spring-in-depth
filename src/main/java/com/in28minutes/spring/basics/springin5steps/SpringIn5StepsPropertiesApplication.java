package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.properties.SomeExternalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Project spring-in5-steps
 * Created by @Author Parinit on 3/9/2020
 * at 7:09 PM
 */
@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                SpringIn5StepsPropertiesApplication.class)) {

            SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
            System.out.println(service.returnServiceURL());
        }
    }
}
