package com.dev.java.concurrencyDemo.threadDemo;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class SemaphoresDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2, true);
        while (true) {
            System.out.println("Enter the Number: ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            System.out.println("Number is: "+num);
            if(num == 0) {
                break;
            }
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        semaphore.acquire();
                        int result = BigThrad.getBigThread(num);
                        System.out.println("Result is: "+result);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        semaphore.release();
                    }
                }
            };
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }
}
