package com.dev.java.interview.string;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World !";

        // 1st way
        System.out.println("2nd way" + getReverseWithReverseMethod(str));

        // 2nd way
        System.out.println("1st" + reverseManually(str));

        // 3rd Way
        System.out.println("3rd Way : "+reverseRecursive(str));
    }

    static String getReverseWithReverseMethod(String str) {
        return new StringBuilder(str)
                .reverse()
                .toString();
    }

    static String reverseManually(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--) {
            stringBuilder.append(str.charAt(i));
        }
        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }

    static String reverseRecursive(String str) {
        if ((null == str) || (str.length() <= 1) ) {
            return str;
        } else {
            return reverseRecursive(str.substring(1)) + str.charAt(0);
        }
    }
}
