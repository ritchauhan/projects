package com.spring.basic;

public class Traingle {
	
	private String type;
	private int height;
	
	public Traingle(int height) {
		this.height = height;
	}
	
//	public Traingle(String type) {
//		this.type = type;
//	}	
//	
	public Traingle(String type, int height) {
		this.type = type;
		this.height = height;
	}
	
	public int getHeight() {
		return height;
	}

	public String getType() {
		return type;
	}

	// Used for setter injection
//	public void setType(String type) {
//		this.type = type;
//	}


	public void draw() {
		System.out.println(getType() + " : Traingle Draw of height : "+getHeight());
	}
}
