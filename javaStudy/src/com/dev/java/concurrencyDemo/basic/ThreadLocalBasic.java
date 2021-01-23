package com.dev.java.concurrencyDemo.basic;

import javax.swing.plaf.TableHeaderUI;

public class ThreadLocalBasic implements Runnable {
    private int value;
    public static void main(String[] args) {
        ThreadLocalBasic threadLocalBasic = new ThreadLocalBasic();
        new Thread(threadLocalBasic, "One").start();
        new Thread(threadLocalBasic, "two").start();
        ThreadLocalBasic threadLocalBasic1 = new ThreadLocalBasic();
        new Thread(threadLocalBasic1, "Three").start();
        ThreadLocal<Integer> integerThreadLocal = new ThreadLocal<>();
        integerThreadLocal.set(threadLocalBasic.value);
        System.out.println(integerThreadLocal.get());
        integerThreadLocal.set(threadLocalBasic1.value);
        System.out.println(integerThreadLocal.get());
    }

    @Override
    public void run() {
        value ++;
        System.out.println(Thread.currentThread().getName() + " incremented value is: " + value);
        value --;
        System.out.println(Thread.currentThread().getName() + " decremented value is: " + value);
    }
}
