package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

    // What are the beans?
    // What are the dependencies of a bean?
    // Where to search for beans? => No need

    public static void main(String[] args) {

        // BinarySearchImpl binarySearch =
        // new BinarySearchImpl(new QuickSortAlgorithm());
        // Application Context
        ApplicationContext applicationContext =
                SpringApplication.run(SpringIn5StepsApplication.class, args);

        BinarySearchImpl binarySearch =
                applicationContext.getBean(BinarySearchImpl.class);

        BinarySearchImpl binarySearch1 =
                applicationContext.getBean(BinarySearchImpl.class);

        System.out.println(binarySearch);
        System.out.println(binarySearch1);

        int result =
                binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
        System.out.println(result);
    }
}
