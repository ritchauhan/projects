package com.dev.innerClasses;

/**
 * 
 * @author rkumar
 *
 */
public class InnerClassDemo {
	private int x = 7;
	
	/**
	 * 
	 */
	public void getInnerShow() {
		InnertoInnerClass innerClass = new InnertoInnerClass();
		innerClass.show();
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		InnerClassDemo innerClassDemo = new InnerClassDemo();
		innerClassDemo.getInnerShow();
	}
	
	/**
	 * 
	 * @author rkumar
	 *
	 */
	class InnertoInnerClass {
		/**
		 * show method of inner class
		 */
		public void show() {
			System.out.println("value of x : "+x);
		}
	}
}
