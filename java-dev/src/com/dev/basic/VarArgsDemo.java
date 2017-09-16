package com.dev.basic;

/**
 * 
 * @author rkumar
 * Var args demo 
 * 1. Var args syntax demo(String a, int... x) we can write int ...x
 * 2. Var args will always be last parameter
 * 3. No multiple var args is one methods
 * 4. Only 3 dots ... are allwoed 
 *
 */
public class VarArgsDemo {
	
	/**
	 * Function to implement var args
	 * @param name
	 * @param address
	 */
	public static void show(String name, String... address) {
		System.out.println("Name is: "+name);
		System.out.println("First Address is: "+address[0]);
		System.out.println("Last Address is: "+address[1]);
	}
	
	/**
	 * 
	 * @param name
	 * @param x
	 */
	public static void demo(String name, int... x) {
		System.out.println("x: "+x[0]);
	}
	
	/**
	 * Main function
	 * @param args
	 */
	public static void main(String args[]) {
		show("Ritesh", "Btm", "Bangaore");
		demo("roll", 1);
	}
}
