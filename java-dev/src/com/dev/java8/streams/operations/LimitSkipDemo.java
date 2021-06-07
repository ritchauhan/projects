package com.dev.java8.streams.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LimitSkipDemo {

    static Optional<Integer> limit(List<Integer> integers) {
        return integers.stream()
                // input 1, 2, 3
                .limit(3) // limit till first 3 element
                .reduce((x,y) -> x+y);
    }

    static Optional<Integer> skip(List<Integer> integers) {
        return integers.stream()
                // input 4, 5
                .skip(3) // skip till first 3 element
                .reduce((x,y) -> x+y);
    }

    public static void main(String[] args) {
        System.out.println(limit(Arrays.asList(1,2,3,4,5))); // 6
        System.out.println(skip(Arrays.asList(1,2,3,4,5))); // 9
    }
}
