package com.dev.java.string;

import java.util.Locale;

public class StringBasic {

    public static void main(String[] args) {
        //String literals stores in string pool
        String s1 = "Hello";
        String s2 = "Hello";
        // it returns true since both the literals points to same pool reference
        System.out.println(s1 == s2); // true
        // String object
        String s3 = new String("Hello");
        // it returns false since it stores in heap and doesn't check for pool
        System.out.println(s1 == s3); // false
        // to check with pool for use intern method
        String s4 = new String("Hello").intern();
        // this will be true since we have used intern method
        System.out.println(s2 == s4);
        s1.toUpperCase();
        System.out.println(s1); // Hello

        String sApp = "this is " + 20 + " year " + Boolean.valueOf(true);
        System.out.println(sApp);
    }
}
