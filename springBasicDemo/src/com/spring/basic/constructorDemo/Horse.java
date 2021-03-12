package com.spring.basic.constructorDemo;

public class Horse {
	
	private String color;
	private int tailSize;
	
	public Horse(String color) {
		this.color = color;
	}
	
	public Horse(int tailSize) {
		this.tailSize = tailSize;
	}
	
	public Horse(String color, int tailSize) {
		this.color = color;
		this.tailSize = tailSize;
	}

	public String getColor() {
		return color;
	}

	public int getTailSize() {
		return tailSize;
	}

	
}
