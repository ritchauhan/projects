package com.dev.java.string;

/**
 * class to demo string buffer
 */
public class StringBufferDemo {

    private static void demoStringBufferMethods(StringBuffer sbr) {
        System.out.println(sbr.reverse());
    }

    public static void main(String[] args) {
        StringBuffer sbr = new StringBuffer("This is Ritesh !");
        demoStringBufferMethods(sbr);
    }
}
