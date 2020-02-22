package com.dev.exceptions;

public class FinallyDemo {
	
	protected static void show(int b) {
		try {
			int a = 10;
			int result = a/b;
			System.out.println(result);
			throw new ArithmeticException("divide by zero");
		} finally {
			System.out.println("finally 1");
		}
	}
	
	protected static void show1(int b) {
		try {
			int a = 10;
			int result = a/b;
			System.out.println(result);
			return;
		} finally {
			System.out.println("finally 2");
		}
	}
	
	protected static void show2(int b) {
		try {
			int a = 10;
			int result = a/b;
			System.out.println(result);
		} finally {
			System.out.println("finally 3");
		}
	}
	
	protected static void show3(int b) {
		try {
			int a = 10;
			int result = a/b;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		finally {
		}
			System.out.println("finally 4");
		}
	
		public static void main(String args[]) {
			try {
				//show(0);
				//show1(0);
				//show2(0);
				//show3(0);
			} catch(Exception e) {
				System.out.println(e);
			}
			
		}
	}

