package com.dev.java8.javabrains.lambda;

public class RunnableLambdaDemo {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("This is runnable");
            }
        });

        thread.run();

        Thread thread1 = new Thread(() -> System.out.println("This is lambda demo"));
        thread1.run();
    }
}
