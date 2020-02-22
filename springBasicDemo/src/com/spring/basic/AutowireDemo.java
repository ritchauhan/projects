package com.spring.basic;

public class AutowireDemo {
	
	private Point pointA;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	
	public void draw() {
		System.out.println("x point "+getPointA().getX());
	}
}
