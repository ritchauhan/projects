package com.dev.innerClasses;

/**
 * 
 * @author rkumar
 *
 */
interface Age {
	int age = 29;
	void getAge();
}

/**
 * 
 * @author rkumar
 *
 */

public class AnnonymsDemo {
	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		System.out.println("inside main");
		Age age = new Age() {
			@Override
			public void getAge() {
				// TODO Auto-generated method stub
				System.out.println("age : "+age);
			}
		};
		age.getAge();
		System.out.println("outside main");
	}
}
