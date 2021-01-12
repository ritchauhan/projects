package com.dev.java.exceptionDemo;

public class TryCatchDemo
{
    public int intDivide(int a, int b) {
        try {
            return  a/b;
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public static void main(String[] args) {
        TryCatchDemo tryCatchDemo = new TryCatchDemo();
        int result = tryCatchDemo.intDivide(20, 0);
        System.out.println(result);
    }
}
