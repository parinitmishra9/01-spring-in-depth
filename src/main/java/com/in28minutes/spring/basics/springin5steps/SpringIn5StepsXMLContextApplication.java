package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.xml.XmlPersonDAO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Project spring-in5-steps
 * Created by @Author Parinit on 3/9/2020
 * at 5:44 PM
 */
@Configuration
@ComponentScan
public class SpringIn5StepsXMLContextApplication {

    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml")) {

            XmlPersonDAO personDao = applicationContext.getBean(XmlPersonDAO.class);
            System.out.println(personDao);
            System.out.println(personDao.getXmlJdbcConnection());
        }
    }
}
