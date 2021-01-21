package com.dev.java.concurrencyDemo.threadDemo;

public class BigThrad {
    public static int getBigThread(int number) {
        for (int i=0; i<=number; i++) {
            for(int j=0; j<=number; j++ ) {
            }
            if(i == number) {
                return i;
            }
        }
        return 0;
    }
}
