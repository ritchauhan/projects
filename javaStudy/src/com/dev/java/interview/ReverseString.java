package com.dev.java.interview;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World !";

        // 1st way
        System.out.println("2nd way" + getReverseWithReverseMethod(str));

        // 2nd way
        System.out.println("1st" + reverseManually(str));
    }

    static String getReverseWithReverseMethod(String str) {
        return new StringBuilder(str)
                .reverse()
                .toString();
    }

    static String reverseManually(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=str.length()-1; i>0; i--) {
            stringBuilder.append(str.charAt(i));
        }
        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }
}
