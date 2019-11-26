package com.dev.oops;

public class InheritanceDemo {
	
	public static void main(String args[]) {
		Inher2 inher2 = new Inher2();
		inher2.show();
	}
}

class Inher1 {
	
	public Inher1() {
		
	}
	
	public Inher1(String test) {
		// TODO Auto-generated constructor stub
	}
	
	public void show() {
		System.out.println(" show method of super class :");
	}
}

class Inher2 extends Inher1 {
	
	public void show() {
		System.out.println(" show method of sub class ");
	}
}
