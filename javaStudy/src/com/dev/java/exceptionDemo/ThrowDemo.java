package com.dev.java.exceptionDemo;

import com.dev.java.basic.ThisDemo;

public class ThrowDemo {
    /**
     * If you want to throw custom exception then use throw. We need to throw it in
     * try and catch otherwise execution will stop.
     * @param a
     * @param b
     * @return
     */
    public int divideByZeroProblem(int a, int b) {
        try {
            int result = a/b;
            if(result <= 0) {
                throw new ArithmeticException("Result is less than zero");
            } else {
                return result;
            }
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }

    }

    public static void main(String[] args) {
        ThrowDemo throwDemo = new ThrowDemo();
        int result = throwDemo.getResult(10, 0);
        System.out.println(result);
        System.out.println("Result executed successfully");
    }

    public int getResult(int a, int b) {
        return divideByZeroProblem(a, b);
    }
}
