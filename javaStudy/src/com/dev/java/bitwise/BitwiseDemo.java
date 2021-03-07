package com.dev.java.bitwise;

public class BitwiseDemo {
    public static void main(String[] args) {
        // binary bit wise operations
        int a = 5; // 00000101
        int b = 7; // 00000111
        int c = 42;

        // And (00000101)
        System.out.println(a & b); // 5

        // Or (00000111)
        System.out.println(a | b); // 7

        // Xor (00000010)
        System.out.println(a ^ b); // 2

        //
        System.out.println(~a); // -6
        System.out.println(~b); // -8
        System.out.println(~c); // -43 need to understand this

    }
}
