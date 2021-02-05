package com.dev.java.interview;

/**
 * Write a program to print 1 to n
 * if number is multiple of 3 print "Fizz"
 * if number is multiple of 5 print "Buzz"
 * if number is multiple of both 3 and 5 then print "Fizz Buzz"
 */
public class FizzBuzz {
    public static void main(String[] args) {
        // print fizz buzz with numbers
        printFizzBuzz(100);
    }

    static void printFizzBuzz(int n) {
        for (int i=1; i<=n; i++) {
            if (i%3 == 0 && i%5 ==0) {
                System.out.println("Fizz Buzz");
            } else if (i%3 == 0 ) {
                System.out.println("Fizz");
            } else if (i%5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
