package com.dev.java.concurrencyDemo.synchronizationBasics;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * This is demo class for unstructured synchronization class.
 */
public class ThreadLockCounter implements Runnable {
    private int value = 0;

    private Lock l = new ReentrantLock();

    public void increment() {
        value ++;
    }

    public void decrement() {
        value --;
    }

    public int getValue() {
        return value;
    }

    @Override
    public void run() {
        // lock implementation also work like synchronization
        // If any exception occur during this execution, lock will be released.
        try {
            l.lock();
            increment();
            System.out.println(Thread.currentThread().getName() + " after increment : " + this.getValue());
            decrement();
            System.out.println(Thread.currentThread().getName() + " after decrement : " + this.getValue());
        } finally {
            l.unlock();
        }
    }

    public static void main(String[] args) {
        // these threads execution will be order since this share same object data.
        ThreadLockCounter counter = new ThreadLockCounter();
        new Thread(counter, "One").start();
        new Thread(counter, "Two").start();
        new Thread(counter, "Three").start();
        new Thread(counter, "Four").start();

        // this thread execute in any order since this thread is independent of above thread.
        ThreadLockCounter counter1 = new ThreadLockCounter();
        new Thread(counter1, "Second thread 1").start();
    }
}
