package com.dev.java8.forEach;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author USER
 * Class to demo forEach method in java 8 with Iterable interface 
 *
 */
public class ForEachJava8 {
	//test main methods
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>();

		// for loop
		for(int i=0; i<10; i++) {
			list.add(i);
		}

		// for in
		for (Integer i : list) {
//			System.out.println(i);
		}

		// forEach lambda
		list.forEach((p) -> System.out.println(p)); // this will take consumer
		list.forEach(System.out::println); // method reference way implementations
		//
	}
}
