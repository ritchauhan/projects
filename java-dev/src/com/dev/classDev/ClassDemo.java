package com.dev.classDev;

/*
 * Basic Demo Class 
 */
public class ClassDemo {
	
	// State Demo
	private static String name = "Ritesh Kumar";
	private static String address = "Bangalore";
	
	// Behavior Demo
	public static String getName() {
		return name;
	}
	
	public static String getAddress() {
		return address;
	}
	
	// Main Method 	
	public static void main (String args[]) {
		System.out.println("Name: "+ClassDemo.getName());
		System.out.println("Address: "+ClassDemo.getAddress());
	}
}
