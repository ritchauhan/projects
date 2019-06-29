package com.dev.java8;

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
		for(int i=0; i<10; i++) {
			list.add(i);
			System.out.println(i);
		}
	}
}
