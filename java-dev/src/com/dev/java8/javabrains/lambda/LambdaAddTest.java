package com.dev.java8.javabrains.lambda;

public class LambdaAddTest {

    public static void main(String[] args) {
        AddDemo addDemo = (a, b) -> a + b;
        System.out.println(addDemo.add(10, 20));
    }

    interface AddDemo {
        int add (int a, int b);
    }
}
