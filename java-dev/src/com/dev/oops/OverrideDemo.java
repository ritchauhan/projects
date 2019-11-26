package com.dev.oops;

import java.io.IOException;

/**
 * class to explain override
 * @author rkumar
 *
 */
public class OverrideDemo extends OverrideSub {
	
	/**
	 * function to test override functionality
	 */
	public void show(String test) throws IOException {
		System.out.println("show method of super class "+test);
	}
	
	/**
	 * main test function
	 * @param args
	 * @throws Exception 
	 */
	public static void main (String args[]) throws Exception {
		OverrideDemo override = new OverrideDemo();
		OverrideSub overrideSub = new OverrideDemo();
		overrideSub.show("test override");
		override.show("hello test");
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
	protected void show (String test) throws Exception {
		int result = 1/0;
		System.out.println("show method of sub class"+test);
	}	
}