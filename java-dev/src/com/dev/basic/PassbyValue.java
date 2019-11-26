package com.dev.basic;

/**
 * 
 * @author rkumar
 * class to demo pass by Value and pass by reference
 *
 */
class Dog {
	private String name;
	public Dog(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
public class PassbyValue {
	
	public static void foo(Dog someDog) {
		someDog.setName("Max");
		someDog = new Dog("Fifi");
		someDog.setName("RowFi");
	}
	
	public static void main(String[] args) {
		Dog d = new Dog("Rover3");
		foo(d);
		System.out.println("dog name : "+d.getName());
		Dog d1 = new Dog("Rover1");
		foo(d1);
		System.out.println("dog name : "+d1.getName());
	}
}