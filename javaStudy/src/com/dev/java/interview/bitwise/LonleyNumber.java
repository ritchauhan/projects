package com.dev.java.interview.bitwise;

public class LonleyNumber {
    public static int lonelyNumber(int[] a) {
        int result = 0;
        for (int i : a) {
            result ^= i;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 1};
        System.out.println(lonelyNumber(a));
    }
}
