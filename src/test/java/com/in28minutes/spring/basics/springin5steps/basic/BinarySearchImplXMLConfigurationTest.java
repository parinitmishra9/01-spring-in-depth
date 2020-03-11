package com.in28minutes.spring.basics.springin5steps.basic;

import com.in28minutes.spring.basics.springin5steps.SpringIn5StepsBasicApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Project spring-in5-steps
 * Created by @Author Parinit on 3/11/2020
 * at 6:33 AM
 */
@SpringBootTest(classes = SpringIn5StepsBasicApplication.class)
@ContextConfiguration(locations = "/testContext.xml")
class BinarySearchImplXMLConfigurationTest {

    // Get the value from the Context
    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    void binarySearch() {
        // Call method Binary Search
        int actualResult = this.binarySearch.binarySearch(new int[] {}, 7);

        // Check if the value is correct
        assertEquals(3, actualResult);
    }
}