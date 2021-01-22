package com.dev.java.concurrencyDemo.threadDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class ThreatPerformanceDemo {
    public static void main(String[] args) {
        int result;
        ArrayList<Thread> threads = new ArrayList<>();
            Runnable statusReporter = new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        try {
                            Thread.sleep(5000);
                            printThreadStatus(threads);
                        } catch (Exception e) {
                            System.out.println(" Thread status thread has been interrupted : ");
                        }
                    }
                }
            };
        Thread statusThread = new Thread(statusReporter);
        statusThread.setDaemon(true);
        System.out.println(statusThread.getState());
        statusThread.start();
//        System.out.println(statusThread);

        while (true) {
            System.out.println("Enter the Number: ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            System.out.println("Number is: "+num);
            if(num == 0) {
                statusThread.interrupt();
                // call join for threat execution halt
                try {
                    System.out.println(" Waiting for all the thread to be completed: ");
                    joinDemo(threads);
                    System.out.println("Done with execution, total thread ran : " + threads.size());
                    break;
                } catch (InterruptedException e) {
                    System.out.println("Interrupted Exception found");
                }
            }
            // Sequential execution
//            result = BigThrad.getBigThread(num);
//            System.out.println("Result is: "+result);
            // Getting the result multithreaded
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    int result = BigThrad.getBigThread(num);
                    System.out.println("Result is: "+result);
                }
            };
            Thread thread = new Thread(runnable);
//            thread.setDaemon(true);
            threads.add(thread);
            thread.start();
        }

    }

    /**
     * Example for thread state.
     * @param threads
     */
    private  static void printThreadStatus(ArrayList<Thread> threads) {
//        System.out.println("Thread status is : ");
        threads.forEach(thread -> {
            System.out.print( thread + " : " +thread.getState() + " ");
        });
    }

    /**
     * Example for thread join
     * @param threads
     */
    private static void joinDemo(ArrayList<Thread> threads) throws InterruptedException{
       for(Thread thread: threads) {
           thread.join();
       }
    }
 }
