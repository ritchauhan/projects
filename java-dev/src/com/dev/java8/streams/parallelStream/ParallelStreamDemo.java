package com.dev.java8.streams.parallelStream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamDemo {

    static long checkPerformance(Supplier<Integer> supplier, int noOfTimes) {
        long start = System.currentTimeMillis();
        for (int i=0; i< noOfTimes; i++) {
            supplier.get();
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    static int sumParallelRange() {
        return IntStream.rangeClosed(1, 100000)
                .parallel()
                .sum();
    }

    static int sumSequentialRange() {
        return IntStream.rangeClosed(1, 100000)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(checkPerformance(ParallelStreamDemo::sumSequentialRange, 20));
        System.out.println(checkPerformance(ParallelStreamDemo::sumParallelRange, 20));

    }
}
