package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Project spring-in5-steps
 * Created by @Author Parinit on 3/9/2020
 * at 4:25 PM
 */
@Configuration
@ComponentScan
public class SpringIn5StepsScopeApplication {

    private static Logger LOGGER =
            LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext applicationContext =
                     new AnnotationConfigApplicationContext(SpringIn5StepsScopeApplication.class)) {
            PersonDAO personDao =
                    applicationContext.getBean(PersonDAO.class);

            PersonDAO personDao2 =
                    applicationContext.getBean(PersonDAO.class);

            LOGGER.info("{}", personDao);
            LOGGER.info("{}", personDao.getJdbcConnection());

            LOGGER.info("{}", personDao2);
            LOGGER.info("{}", personDao.getJdbcConnection());
        }
    }
}
