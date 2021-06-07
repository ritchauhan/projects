package com.dev.java8.streams.numricStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMap {

    static List<Integer> mapToObj() {
        return IntStream.rangeClosed(1,5)
                .mapToObj((i) -> {
                    return new Integer(i);
                })
                .collect(Collectors.toList());
    }

    static long mapToLong() {
        return IntStream.rangeClosed(1, 5)
                .mapToLong(i->i)
                .sum();
    }

    static double mapToDouble() {
        return IntStream.rangeClosed(1, 5)
                .mapToDouble(i->i)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(mapToObj());
        System.out.println(mapToLong());
        System.out.println(mapToDouble());
    }
}
