package com.dev.innerClasses;

/**
 * Demo class to show method inner class
 * 
 * @author rkumar
 *
 */
public class MethodInnerClass {

	String name = "Ritesh Kumar";

	/**
	 * 
	 */
	public void show() {
		/**
		 * A method-local inner class can be instantiated only within the method
		 * where the inner class is defined.
		 * 
		 * @author rkumar
		 *
		 */
		String address = "Bangalore";
		int y = 10;
		final String phone = "888888888";
		class MethodInner {
			/**
			 * method to show outer class value 1. method inner class only can
			 * access outer class variable and function
			 *  2. In can't access method local variables because of stack scope
			 *  3. local variable marked final can be used from method inner class 
			 *  - need to verify(Java 8 it will work fine)
			 */
			public void showOuter() {
				System.out.println("Name : " + name);
				System.out.println("address : " + address); // need to check
															// this
				System.out.println("phone : " + phone); // print correctly due
														// to java 8 .if
														// reassign this value
														// then it will give
														// compiler errot
				System.out.println("y : " + y);
			}
		}
		// Need to create object of inner class inside the method else inner
		// class functions and variables will not be accessible
		MethodInner methodInner = new MethodInner();
		// y = 15;
		methodInner.showOuter();
	}

	/**
	 * test method
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		MethodInnerClass methodInnerClass = new MethodInnerClass();
		methodInnerClass.show();
	}

}
