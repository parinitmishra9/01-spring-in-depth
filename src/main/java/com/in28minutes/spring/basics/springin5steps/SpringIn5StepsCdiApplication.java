package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.cdi.SomeCdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Project spring-in5-steps
 * Created by @Author Parinit on 3/9/2020
 * at 5:11 PM
 */
@Configuration
@ComponentScan
public class SpringIn5StepsCdiApplication {

    private static Logger LOGGER =
            LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext applicationContext =
                     new AnnotationConfigApplicationContext(SpringIn5StepsCdiApplication.class)) {

            SomeCdiBusiness business =
                    applicationContext.getBean(SomeCdiBusiness.class);

            LOGGER.info("{} dao-{}", business, business.getSomeCDIDAO());
        }
    }
}
