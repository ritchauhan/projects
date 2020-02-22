package com.dev.exceptions;

public class TestThrowDemo {
	
	protected static void show1(int marks) {
		try {
			String name = "Ritesh";
			int roll = 100;
			int result = roll/marks;
			System.out.println(result);
		} catch(ArithmeticException e) {
			throw e;
		}
	}
	
	protected static void show() {
		show1(0);
	}
	
	public static void main(String args[]) {
		try {
			show();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
