package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.cdi.SomeCdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @Project spring-in5-steps
 * Created by @Author Parinit on 3/9/2020
 * at 5:11 PM
 */
@SpringBootApplication
public class SpringIn5StepsCdiApplication {

    private static Logger LOGGER =
            LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);

    public static void main(String[] args) {

        ApplicationContext applicationContext =
                SpringApplication.run(SpringIn5StepsCdiApplication.class, args);

        SomeCdiBusiness business =
                applicationContext.getBean(SomeCdiBusiness.class);

        LOGGER.info("{} dao-{}", business, business.getSomeCDIDAO());
    }
}
