package com.dev.java8.streams.numricStream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class AggregateDemo {

    public static void main(String[] args) {
        // sum methods
        int sum = IntStream.rangeClosed(1, 5)
                .sum();
        System.out.println("Sum result is: " + sum); // Sum result is: 15

        // min
        OptionalInt optionalInt = IntStream.rangeClosed(50, 100)
                .min();
        System.out.println(" Optional int result is " + (optionalInt.isPresent() ? optionalInt.getAsInt() : 0)); //  Optional int result is 50

        // max
        OptionalLong optionalLong = LongStream.rangeClosed(1, 25)
                .max();
        System.out.println(" Optional long result is " + (optionalLong.isPresent() ? optionalLong.getAsLong() : 0)); // Optional long result is 25

        // average
        OptionalDouble optionalDouble = LongStream.rangeClosed(1, 50).asDoubleStream()
                .average();
        System.out.println(" Optional double result is : " + (optionalDouble.isPresent() ? optionalDouble.getAsDouble() : 0)); // Optional double result is : 25.5

    }
}
