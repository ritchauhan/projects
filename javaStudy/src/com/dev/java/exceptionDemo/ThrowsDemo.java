package com.dev.java.exceptionDemo;

public class ThrowsDemo {

    public int divideByZeroProblem(int a, int b) throws ArithmeticException {
        int result = a/b;
        if(result <= 0) {
            throw new ArithmeticException("Result is less than or equal to zero");
        } else {
            return result;
        }
    }

    int getResult(int a, int b) {
        try {
            return divideByZeroProblem(a, b);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }

    }

    public static void main(String[] args) {
        ThrowsDemo throwDemo = new ThrowsDemo();
        int result = throwDemo.getResult(10, 0);
        System.out.println(result);
        System.out.println("Result executed: ");
    }
}
