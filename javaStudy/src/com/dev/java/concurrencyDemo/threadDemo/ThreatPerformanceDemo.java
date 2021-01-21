package com.dev.java.concurrencyDemo.threadDemo;

import java.util.Scanner;

public class ThreatPerformanceDemo {
    public static void main(String[] args) {
        int result;
        while (true) {
            System.out.println("Enter the Number: ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            System.out.println("Number is: "+num);
            if(num == 0) {
                break;
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
            thread.setDaemon(true);
            thread.start();
        }

    }
}
