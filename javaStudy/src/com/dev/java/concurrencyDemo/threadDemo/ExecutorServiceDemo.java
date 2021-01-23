package com.dev.java.concurrencyDemo.threadDemo;

import java.util.Scanner;
import java.util.concurrent.*;

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");

        // fixed thread pool.
         ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        // single thread pool.
        // ExecutorService executorService = Executors.newSingleThreadExecutor();

        // cached thread pool
        // ExecutorService executorService = Executors.newCachedThreadPool();

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);

        Runnable schedulerRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Scheduler is running: ");
                System.out.println(executorService.getActiveCount());
                System.out.println(executorService.getCompletedTaskCount());
            }
        };

        scheduledExecutorService.scheduleAtFixedRate(schedulerRunnable, 1, 5, TimeUnit.SECONDS);

        while(true) {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            if(num == 0) {
                System.out.println("Main threat has been exit..");
                break;
            }
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    System.out.println("input nomber is : " + num);
                    int result = BigThrad.getBigThread(num);
                    System.out.println("Output number : " + result);
                }
            };
            executorService.execute(runnable);
        }
    }
}
