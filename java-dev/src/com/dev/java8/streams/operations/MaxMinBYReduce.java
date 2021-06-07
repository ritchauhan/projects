package com.dev.java8.streams.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxMinBYReduce {

    // max value with int return type
    static int getMaxValue(List<Integer> intList) {
        return intList.stream()
                .reduce(200, (x, y) -> (x > y ? x : y));
    }

    static Optional<Integer> getMaxOptionalValue(List<Integer> intList) {
        return intList.stream()
                .reduce((x, y) -> (x > y ? x : y));
    }


    // min value with int return type
    static int getMinValue(List<Integer> intList) {
        return intList.stream()
                .reduce(0, (x, y) -> (x < y ? x : y));
    }

    static Optional<Integer> getMinOptionalValue(List<Integer> intList) {
        return intList.stream()
                .reduce((x, y) -> (x < y ? x : y));
    }

    public static void main(String[] args) {

        // Max test
        System.out.println(getMaxValue(Arrays.asList(4,5,6,9))); // 200
        Optional<Integer> optionalMaxInteger = getMaxOptionalValue(Arrays.asList(4, 5, 6, 100));
        if(optionalMaxInteger.isPresent()) {
            System.out.println(optionalMaxInteger.get()); // 100
        }
        // Min test
        // Never use default value for min and max value since that also will be used for comparision
        System.out.println(getMinValue(Arrays.asList(4,5,6,9))); // 0
        Optional<Integer> optionalMinInteger = getMinOptionalValue(Arrays.asList(4, 5, 6, 100));
        if(optionalMinInteger.isPresent()) {
            System.out.println(optionalMinInteger.get()); // 4
        }
    }
}
