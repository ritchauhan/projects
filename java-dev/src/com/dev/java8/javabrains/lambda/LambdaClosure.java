package com.dev.java8.javabrains.lambda;

/**
 * class to demo closure in java with lambda
 */
public class LambdaClosure {
    public static void main(String[] args) {
        int a = 10;
        int b = 20; // this should be effective final
        /**
         * freezing the value of b=20 is closure. this value will available
         * wherever lambda will be access
         */
        process(a, i -> System.out.println(i+b));
        test();
    }

    public static void test() {
        int c = 30;
        process(11, i -> System.out.println(i + c));
    }

    private static void process(int i, Process p) {
        p.process(i);
    }
}

interface Process {
    public void process(int i);
}
