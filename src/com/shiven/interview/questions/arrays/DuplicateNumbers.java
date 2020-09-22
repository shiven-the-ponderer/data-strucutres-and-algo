package com.shiven.interview.questions.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateNumbers {

//    We are given an unsorted array containing numbers taken from the range 1 to ‘n’. The array can have duplicates, which means some numbers will be missing. Write and function to find and return all those missing numbers.
//    Example 1:
//    Input: [2, 3, 1, 8, 2, 3, 5, 1]
//    Output: 4, 6, 7
//    Explanation: The array should have all numbers from 1 to 8, due to duplicates 4, 6, and 7 are missing.
//
//    Example 2:
//    Input: [2, 4, 1, 2]
//    Output: 3
//
//    Example 3:
//    Input: [2, 3, 2, 1]
//    Output: 4

    public static List<Integer> findDuplicate(int[] input) {
        List<Integer> output = new ArrayList<>();
        for(int i=1;i<=input.length;i++) {
            boolean foundNum = false;
            for(int j=0;j<input.length;j++) {
                if(i==input[j]) {
                    foundNum = true;
                    break;
                }
            }
            if(!foundNum) {
                output.add(i);
            }
        }

        return output;
    }

    public static void main(String[] args) {
        int[] input = {2,3,1,8,2,5,3,1};
        List<Integer> output =  DuplicateNumbers.findDuplicate(input);
        output.forEach(System.out::println);
    }

}
