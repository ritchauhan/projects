package com.dev.java8.lambda.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
    public static UnaryOperator<Integer> unaryOperator = (a) -> a*5;
    public static void main(String[] args) {
        System.out.println(unaryOperator.apply(10));
    }
}
