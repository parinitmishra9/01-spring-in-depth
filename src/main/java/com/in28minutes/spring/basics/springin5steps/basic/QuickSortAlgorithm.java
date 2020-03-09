package com.in28minutes.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @Project spring-in5-steps
 * Created by @Author Parinit on 3/8/2020
 * at 8:46 PM
 */
@Service
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {
    public int[] sort(int[] numbers) {
        // Logic for Quick Sort
        return numbers;
    }
}
