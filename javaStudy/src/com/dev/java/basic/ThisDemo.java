package com.dev.java.basic;

public class ThisDemo {

    int seat;
    int color;
    String name;

    public ThisDemo(int seat) {
        this.seat = seat;
    }

    boolean isSeat (int seat) {
        return  this.seat >= seat;
    }

    public static void main(String[] args) {
        ThisDemo thisDemo = new ThisDemo(10);
        boolean result = thisDemo.isSeat(10);
        System.out.println(result);
    }
}
