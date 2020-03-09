package com.in28minutes.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @Project 01-spring-in-depth
 * Created by @Author Parinit on 3/8/2020
 * at 8:46 PM
 */
@Service
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {
    public int[] sort(int[] numbers) {
        // Logic for Bubble Sort
        return numbers;
    }
}
