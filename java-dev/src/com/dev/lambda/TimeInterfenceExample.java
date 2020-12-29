package com.dev.lambda;

public class TimeInterfenceExample {
	@FunctionalInterface
	interface StringLenCalculator {
		int getStringLength(String s);
	}
	
	public static void main(String args[]) {
		StringLenCalculator stringLenCalculator = (s) -> s.length();
		System.out.println(stringLenCalculator.getStringLength("Hello World"));
	}

}
