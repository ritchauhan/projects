package com.dev.lambda;

import java.util.ArrayList;

/**
 * class to show simple lambda expression 
 * @author rkumar
 *
 */
public class LambdaExpression {
	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		// Integer array list
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		arrList.add(4);
		
		// for each loop demo
		for(int a: arrList) {
			System.out.println("value of a : "+a);
		}
		
		// lambda expression to print all the elements
		arrList.forEach(x -> System.out.println("value of x : "+x));
		
		//lambda expression for print all even elements 
		arrList.forEach(n -> {if (n%2 == 0) System.out.println(n);});
		
	}
}
