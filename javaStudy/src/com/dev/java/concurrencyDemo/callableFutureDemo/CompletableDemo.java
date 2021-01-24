package com.dev.java.concurrencyDemo.callableFutureDemo;

import com.dev.java.concurrencyDemo.threadDemo.BigThrad;

import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

public class CompletableDemo {
    public static void main(String[] args) {
        while (true) {
            System.out.println(" Enter a number: ");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            if (num==0) break;

            CompletableFuture.supplyAsync(() -> BigThrad.getBigThread(num))
                    .thenAccept((Integer result) -> System.out.println("result is: " + result));
        }
    }
}
