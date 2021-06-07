package com.dev.effectivejava.chapter1;

public class ImmutableDemo {

	public static void main(String args[]) {

		Immutabletest immutabletest = new Immutabletest("Ritesh Chauhan");
		System.out.println(immutabletest.getName());
		System.out.println(immutabletest.hashCode());

		Immutabletest immutabletest1 = new Immutabletest("Ritesh Kumar");
		System.out.println(immutabletest1.getName());
		System.out.println(immutabletest1.hashCode());
		
		ImmutableSinglton immutableSinglton = ImmutableSinglton.getInstance(10);
		System.out.println(immutableSinglton.getRollNo());
		System.out.println(immutableSinglton.hashCode());
		
		ImmutableSinglton immutableSinglton1 = ImmutableSinglton.getInstance(12);
		System.out.println(immutableSinglton1.getRollNo());
		System.out.println(immutableSinglton1.hashCode());

	}

}

final class Immutabletest {

	private final String name;

	public Immutabletest(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}

final class ImmutableSinglton {
	
	private final int rollno;
	
	private ImmutableSinglton(int rollno) {
		this.rollno = rollno;
	}
	
	public int getRollNo() {
		return this.rollno;
	}
	
	public static ImmutableSinglton getInstance(int rollno) {
		return new ImmutableSinglton(rollno);
	}
}