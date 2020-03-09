package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Project 01-spring-in-depth
 * Created by @Author Parinit on 3/8/2020
 * at 8:53 PM
 */
@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgorithm quickSortAlgorithm;

    public int binarySearch(int[] numbers, int numberToSearchFor) {

        int[] sortedNumbers = quickSortAlgorithm.sort(numbers);
        System.out.println(quickSortAlgorithm);
        // Search the array
        return 3;
    }

}
