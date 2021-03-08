package com.dev.java.bitwise;

public class BitwiseDemo {
    public static void main(String[] args) {
        // binary bit wise operations
        int a = 5; // 00000101
        int b = 7; // 00000111
        int c = 42;
        int d = 128; // 01000000
        int e = -128; // 111101000000

        // And (00000101)
        System.out.println(a & b); // 5

        // Or (00000111)
        System.out.println(a | b); // 7

        // Xor (00000010)
        System.out.println(a ^ b); // 2

        // 2 compliment
        System.out.println(~a); // -6
        System.out.println(~b); // -8
        System.out.println(~c); // -43 need to understand this

        // left shift
        System.out.println(d<<2); // 512 - 0000 0001 0000 0000 (128 * 2 * 2)
        System.out.println(e<<2); // -512 - 1111 0001 0000 0000 (-128 * 2 * 2)

        // right shift
        System.out.println(d>>2); // 32 ((128/2)/2)
        System.out.println(e>>2); // -32 - ((128/2)/2) it preserve the signed bit

        // unsigned right shift
        System.out.println(d>>>2); // 32 right shift by 2 and 0 on left since d=128
        System.out.println(e>>>2); // 1073741792 0011 1111 1111 1111 1111 1111 0010 0000

        // 2^30 power 
        System.out.println(Math.pow(2, 30)); // 1.073741824E9



    }
}
