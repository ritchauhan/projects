package com.dev.java8.javabrains.lambda;

@FunctionalInterface
public interface HelloWorldInterface {
	public void greeting();

	public default void greet() {
		System.out.println("this is the methods: ");
	}
}
