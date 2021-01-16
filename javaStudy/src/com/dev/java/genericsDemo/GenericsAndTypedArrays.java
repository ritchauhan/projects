package com.dev.java.genericsDemo;

public class GenericsAndTypedArrays {
    public static void main(String[] args) {
        String[] arr = new String[10];
        getStringArr(arr, 10);
        System.out.println(arr);
    }

    static void getStringArr (Object[] arr, Integer s) {
        System.out.println(arr.length);
        // this will fail since we are passing object arr and internally it is String arr so it can't assign int.
        arr[2] = s;
    }

}
