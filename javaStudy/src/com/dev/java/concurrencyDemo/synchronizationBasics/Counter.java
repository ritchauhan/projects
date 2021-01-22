package com.dev.java.concurrencyDemo.synchronizationBasics;

/**
 * Basic synchronization demo.
 */
public class Counter implements Runnable {
    private int value = 0;

    public void increment() {
       value ++;
    }

    public void decrement() {
        value --;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public void run() {
        synchronized (this) {
            increment();
            System.out.println(Thread.currentThread().getName() + " after increment : " + value);
            decrement();
            System.out.println(Thread.currentThread().getName() + " after decrement : " + value);
        }
    }

    public static void main(String[] args) {
        // these threads execution will be order since this share same object data.
        Counter counter = new Counter();
        new Thread(counter, "One").start();
        new Thread(counter, "Two").start();
        new Thread(counter, "Three").start();
        new Thread(counter, "Four").start();

        // this thread execute in any order since this thread is independent of above thread.
        Counter counter1 = new Counter();
        new Thread(counter1, "Second thread 1").start();
    }
}
