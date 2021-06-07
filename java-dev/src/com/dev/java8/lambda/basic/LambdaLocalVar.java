package com.dev.java8.lambda.basic;

import java.util.function.Consumer;

public class LambdaLocalVar {
    public static void main(String[] args) {
        int i = 0;
        int value = 12;
        // Consumer<Integer> integerConsumer = (i) -> System.out.println(i); // variable i already defined in scope.
        Consumer<Integer> integerConsumer = (i1) -> System.out.println(i1);
        Consumer<Integer> integerConsumer1 = (i2) -> {
            // System.out.println(value++); // variable used in lambda should be effective final
            System.out.println(value);
        };
//        value =11; // we can't reassign this value since used in lambda
        integerConsumer.accept(10);
        integerConsumer1.accept(11);
    }
}
