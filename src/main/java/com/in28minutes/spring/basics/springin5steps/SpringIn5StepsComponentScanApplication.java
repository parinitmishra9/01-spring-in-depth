package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Project spring-in5-steps
 * Created by @Author Parinit on 3/9/2020
 * at 4:50 PM
 */
@SpringBootApplication
@ComponentScan("com.in28minutes.spring.basics.componentscan")
public class SpringIn5StepsComponentScanApplication {

    private static Logger LOGGER =
            LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

    public static void main(String[] args) {

        ApplicationContext applicationContext =
                SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);

        ComponentDAO componentDAO =
                applicationContext.getBean(ComponentDAO.class);

        LOGGER.info("{}", componentDAO);

    }
}
