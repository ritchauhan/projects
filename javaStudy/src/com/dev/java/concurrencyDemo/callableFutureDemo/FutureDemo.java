package com.dev.java.concurrencyDemo.callableFutureDemo;

import com.dev.java.concurrencyDemo.threadDemo.BigThrad;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.*;

public class FutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ArrayList<Future<Integer>> futureStatus = new ArrayList<>();
        while(true) {
            System.out.println("Enter a number : ");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            if(num == 0) break;
            Callable<Integer> callable = new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    System.out.println("number is: " + num);
                    return BigThrad.getBigThread(num);
                }
            };
            Future<Integer> futureResult = executorService.submit(callable);
            futureStatus.add(futureResult);
        }
        System.out.println(futureStatus);
        Iterator<Future<Integer>> futureIterator = futureStatus.iterator();
        while (futureIterator.hasNext()) {
            Future<Integer> res = futureIterator.next();
            System.out.println("waiting for the result" +res);
            if(res.isDone()) {
                System.out.println(" result is :" + res.get());
                futureIterator.remove();
            }
        }

    }
}
