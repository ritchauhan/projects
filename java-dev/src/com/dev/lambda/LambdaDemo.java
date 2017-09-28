package com.dev.lambda;

interface FuncInterface {
	// An abstract function
	void abstractFunc(int x);
	// A non-abstract (or default) function
	/**
	 * 1.Default methods enable you to add new functionality to the 
	 * interfaces of your libraries and ensure binary compatibility 
	 * with code written for older version of those interfaces  
	 */
	default void normalFun() {
		System.out.println("Hello");
	}
	
}
/**
 * Lambda expression example
 * Syntax :
 * lambda operator -> body
 * 1. Zero parameter
 *    () -> System.out.println("Zero parameter lambda");
 * 2. One parameter
 *    (p) -> System.out.println("One param : "+p);
 * 3. Two parameter
 *    (p1, p2) -> System.out.println("Multiple param : "+ p1 + " , " + p2);
 * @author rkumar
 *
 */
public class LambdaDemo {
	// main methods
	public static void main(String args[]) {
		// anonymous class example
		FuncInterface funcInterface = new FuncInterface() {
			
			@Override
			public void abstractFunc(int x) {
				System.out.println("value of x : "+x);
				
			}
		};
		funcInterface.abstractFunc(10);
		
		//lambda expression(java 8)
		// functional interface with one abstract method
		FuncInterface funcInterface2 = (int x) -> System.out.println(2*x);
		funcInterface2.abstractFunc(10);
	}
}
