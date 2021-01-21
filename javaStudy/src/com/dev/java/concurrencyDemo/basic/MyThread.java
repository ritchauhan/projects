package com.dev.java.concurrencyDemo.basic;

public class MyThread extends Thread {
    public void run() {
        System.out.println("Thread run for thread class: ");
    }
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
