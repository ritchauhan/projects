package com.dev.java8.optional;

import java.util.Optional;

public class NullableOfDemo {

    static Optional<String> nullableOfDemo() {
        return Optional.ofNullable("Hello World");
//        return Optional.ofNullable(null);
    }

    static Optional<String> ofDemo() {
        return Optional.of("Hello !!");
//        return Optional.of(null);
    }

    public static void main(String[] args) {
        Optional<String> nullableTest = nullableOfDemo();
        // it doesn't throw null pointer exception for null values. Optional.empty (for null values).
        System.out.println(nullableTest);
        if(nullableTest.isPresent()) {
            System.out.println(nullableTest);
        }

        Optional<String> ofTest = ofDemo();
        // it does throw null pointer exception for null values.
        System.out.println(ofTest);
    }
}
