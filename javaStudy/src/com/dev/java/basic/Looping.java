package com.dev.java.basic;

public class Looping {
    public static void loop() {
        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                for (int z=0; z<10; z++) {
                    System.out.println(i + " " + j + " " + z );
                    return;
                }
            }
        }
    }
    public static void main(String[] args) {
        loop();
        System.out.println("outside the loop: ");
    }

}
