package com.dev.java8.lambda.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
    public static BinaryOperator<Integer> binaryOperator = (a, b) -> a*b;
    static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
    public static void main(String[] args) {
        System.out.println(binaryOperator.apply(10, 20));
        System.out.println(BinaryOperator.maxBy(comparator).apply(10,20));
        System.out.println(BinaryOperator.minBy(comparator).apply(10,20));
    }
}
