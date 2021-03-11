package com.dev.java.string;

/**
 * class to demo string builder class
 */
public class StringBuilderDemo {

    private static void demoStringBuilderMethods(StringBuilder sbr) {
        /**
         * The capacity is the amount of storage available for newly inserted characters,
         * beyond which an allocation will occur.
         */
        System.out.println(sbr.capacity());

        System.out.println(sbr.length());

        sbr.insert(29, " Test");

        System.out.println(sbr.toString());
    }

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("THis is my home and i am king");
        demoStringBuilderMethods(stringBuilder);

    }
}
