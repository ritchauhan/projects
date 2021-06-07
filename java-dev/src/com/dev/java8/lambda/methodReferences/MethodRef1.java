package com.dev.java8.lambda.methodReferences;

import java.util.function.Consumer;
import java.util.function.Function;

public class MethodRef1 {

    static Function<String, String> function = str -> str.toUpperCase();
    // method references
    static Function<String, String> function1 = String::toUpperCase;


    public static void main(String[] args) {
        System.out.println(function.apply("Java8"));
        System.out.println(function1.apply("Java9"));
    }
}
