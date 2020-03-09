package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @Project spring-in5-steps
 * Created by @Author Parinit on 3/9/2020
 * at 4:25 PM
 */
@SpringBootApplication
public class SpringIn5StepsScopeApplication {

    private static Logger LOGGER =
            LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

    public static void main(String[] args) {

        ApplicationContext applicationContext =
                SpringApplication.run(SpringIn5StepsScopeApplication.class, args);

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
