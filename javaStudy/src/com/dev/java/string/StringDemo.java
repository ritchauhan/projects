package com.dev.java.string;


import java.util.Locale;
import java.util.stream.IntStream;

/**
 * Class to demo string in java
 */
public class StringDemo {

    private static void demoMethods(String demoStr) {
        // charAtIndex
        System.out.println(demoStr.charAt(1));

        // uppercase with locale
        System.out.println(demoStr.toUpperCase(Locale.ROOT));

        //  to get intStream
        System.out.println(demoStr.chars());

        // code point at index
        System.out.println(demoStr.codePointAt(1));

        // string intern
        System.out.println(demoStr.intern());

    }

    public static void main(String[] args) {
        String str = new String();
        str = "Test";
        String str1 = new String();
        str1 = str;
        String str3 = "Test123";
        str3 = str1;
//        System.out.println(str + " " + str1 +" " + str3);
//        System.out.println(str.hashCode() + " " + str1.hashCode() +" " + str3.hashCode());
//        System.out.println(str.equals(str1));
        demoMethods("This is me ! say hi to World");

    }
}
