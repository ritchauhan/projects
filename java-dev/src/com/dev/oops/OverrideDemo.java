package com.dev.oops;

/**
 * class to explain override
 * @author rkumar
 *
 */
public class OverrideDemo extends OverrideSub {
	
	/**
	 * function to test override functionality
	 */
	public void show() {
		System.out.println("show method of super class");
	}
	
	/**
	 * main test function
	 * @param args
	 */
	public static void main (String args[]) {
		OverrideDemo override = new OverrideDemo();
		override.show();
	}
}

/**
 * 
 * @author rkumar
 *
 */
class OverrideSub  {
	/**
	 * show method for test override
	 */
	public void show() {
		System.out.println("show method of sub class");
	}	
}