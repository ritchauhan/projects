package com.dev.java8.streams.numricStream;

import java.util.stream.IntStream;

public class NumericDemo {

    static int getNumericSum() {
        return IntStream.rangeClosed(1, 5) // [1,2,3,4,5]
                .sum();
    }
    public static void main(String[] args) {
        System.out.println(getNumericSum()); //15
    }
}
