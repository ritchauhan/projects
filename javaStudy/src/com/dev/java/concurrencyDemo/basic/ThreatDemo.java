package com.dev.java.concurrencyDemo.basic;

public class ThreatDemo {

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();

        new Thread(() -> System.out.println("2nd Thread running")).start();
    }
}
