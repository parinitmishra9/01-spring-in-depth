package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Project spring-in5-steps
 * Created by @Author Parinit on 3/9/2020
 * at 5:44 PM
 */
public class SpringIn5StepsXMLContextApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml")) {

            LOGGER.info("Beans Loaded -> {}", (Object) applicationContext.getBeanDefinitionNames());
            // [xmlJdbcConnection, xmlPersonDAO]

            XmlPersonDAO personDao = applicationContext.getBean(XmlPersonDAO.class);

            LOGGER.info("{} {}", personDao, personDao.getXmlJdbcConnection());
        }
    }
}
