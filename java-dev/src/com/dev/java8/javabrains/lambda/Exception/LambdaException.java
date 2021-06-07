package com.dev.java8.javabrains.lambda.Exception;

import java.util.function.BiConsumer;

public class LambdaException {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int key = 5;
        process(arr, key, wrapperLambda((v, k) -> System.out.println(v / k)));
    }

    private static void process(int[] arr, int key, BiConsumer<Integer, Integer> biConsumer) {
        for (int i : arr)
            biConsumer.accept(i, key);
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biConsumer) {
        return (v, k) -> {
            try {
                biConsumer.accept(v, k);
            } catch (ArithmeticException ae) {
                System.out.println(ae.fillInStackTrace());
            }
        };
    }
}
