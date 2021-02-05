package com.dev.java.interview;

import java.util.HashMap;
import java.util.Map;

/**
 * Implement a solution which add two numbers from array and find the match.
 * For example [10, 20, 30, 40, 50] -> no is 70 - so result is (2, 3)
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] numArr = {10, 20, 30, 40, 50};
        int resultNo = 70;
        findTwoSum(numArr, resultNo);
    }

    static void findTwoSum(int[] numArr, int resultNo) {
        Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        for (int i=0; i<numArr.length; i++) {
            int delta = resultNo - numArr[i];
            if (numMap.containsKey(delta)) {
                System.out.println(numMap.get(delta) + " , " + i);
                return;
            } else {
                numMap.put(numArr[i], i);
            }
        }
        System.out.println("no two sum found as : "+resultNo);
    }
}
