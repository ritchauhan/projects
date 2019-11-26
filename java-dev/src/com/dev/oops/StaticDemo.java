package com.dev.oops;

/**
 * 
 * @author rkumar
 * Class to show static use case
 *
 */
public class StaticDemo {
	static int frogCount = 0;
	// int frogCount = 0;
	public StaticDemo() {
		frogCount += 1;
	}
	
	public static void main(String args[]) {
		new StaticDemo();
		new StaticDemo();
		new StaticDemo();
		new StaticDemo();
		// incase of static frogcount is 4
		// non static varible show error like nonstatic variable frogCount 
		// cannot be referenced from a static context
		System.out.println("Frog count : "+frogCount); 
		
	}
}

