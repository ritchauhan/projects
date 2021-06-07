package com.dev.java8.streams.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {

    static int getMultiplicationResult(List<Integer> list) {
        return list.stream()
                .reduce(1, (a,b) -> a*b);
    }

    static Optional<Integer> getMultiplication(List<Integer> list) {
        return list.stream()
                .reduce((a,b) -> a*b); // terminal condition
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(getMultiplicationResult(list));

        Optional<Integer> multi = getMultiplication(list);
        System.out.println(multi.isPresent());
        // always check isPresent before using Optional so if no value present then it will not break
        if (multi.isPresent()) {
            System.out.println(multi.get());
        }

    }
}
