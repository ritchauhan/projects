package com.dev.exceptions;

public class ThrowsDemo {
	
	public static void show() throws InterruptedException {
		show1();
	}
	
	public static void show1() throws InterruptedException {
		Thread.sleep(10000); 
        System.out.println("Hello Geeks"); 
	}
	
	public static void main(String args[]) throws InterruptedException {
		show();
	}
}

