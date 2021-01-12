package com.dev.java.exceptionDemo;

public class FinallyDemo {

    public boolean arrayOutOfBoundProblem () {
        int arr[] = {10, 20, 30, 40};
        try {
            if (arr[5] > 100) {
                return false;
            } else {
                return true;
            }
        } catch (ArrayIndexOutOfBoundsException ae) {
            ae.printStackTrace();
            // If we need to exit without finally execution.
//            System.exit(0);
            return false;
        } finally {
            System.out.println("Size of the array : "+arr.length);
        }

    }

    public static void main(String[] args) {
        FinallyDemo finallyDemo = new FinallyDemo();
        boolean result = finallyDemo.arrayOutOfBoundProblem();
        System.out.println(result);
    }
}
