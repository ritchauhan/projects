package com.dev.innerClasses;

/**
 * static demo class
 * @author rkumar
 *
 */
public class StaticInnerClass {
	/**
	 * 
	 * @author rkumar
	 *
	 */
	static class A {
		/**
		 * 
		 */
		void show() {
			System.out.println("show1");
		}
	}
	/**
	 * test method
	 * @param args
	 */
	public static void main(String args[]) {
		A a = new A();
		a.show();
//		StaticOuter statB = new StaticOuter(); // not working need to verify
//		statB.
	}
}

/**
 * 
 * @author rkumar
 *
 */
class StaticOuter {
	/**
	 * 
	 * @author rkumar
	 *
	 */
	static class B {
		/**
		 * 
		 */
		void demo() {
			System.out.println("b class methods");
		}
	}
}