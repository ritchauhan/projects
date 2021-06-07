package com.dev.java8.streams.numricStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericBoxingUnboxing {

    static List<Integer> boxing() {
        // int to wrapper
        return IntStream.rangeClosed(1, 10)
                .boxed()
                .collect(Collectors.toList());
    }

    static int unboxing(List<Integer> integers) {
        // wrapper to int
        return integers.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
    public static void main(String[] args) {
        System.out.println(boxing()); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println(unboxing(boxing())); //55
    }
}
