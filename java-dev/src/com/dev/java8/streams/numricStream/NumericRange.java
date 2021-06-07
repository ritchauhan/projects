package com.dev.java8.streams.numricStream;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericRange {

    public static void main(String[] args) {
        System.out.println("IntStream RangeClosed: ");
        IntStream.rangeClosed(1,50).forEach((value) -> System.out.print(value + ", ")); // 1 to 50
        System.out.println("IntStream Range: ");
        IntStream.range(1,50).forEach((value) -> System.out.print(value + ", ")); // 1 to 49
        System.out.println("LongStream Range Closed : ");
        LongStream.rangeClosed(1, 50).forEach(value -> System.out.print(value + ", ")); // 1 to 50
        System.out.println("LongStream Range : ");
        LongStream.range(1, 50).forEach(value -> System.out.print(value + ", ")); // 1 to 49
        System.out.println("Double Stream rangeClosed");
        IntStream.rangeClosed(1,50).asDoubleStream().forEach(value -> System.out.print(value + ", "));
        System.out.println("Double Stream range");
        IntStream.range(1,50).asDoubleStream().forEach(value -> System.out.print(value + ", "));
    }
}
