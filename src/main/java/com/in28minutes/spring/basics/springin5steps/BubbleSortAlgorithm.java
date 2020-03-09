package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @Project 01-spring-in-depth
 * Created by @Author Parinit on 3/8/2020
 * at 8:46 PM
 */
@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {
    public int[] sort(int[] numbers) {
        // Logic for Bubble Sort
        return numbers;
    }
}
