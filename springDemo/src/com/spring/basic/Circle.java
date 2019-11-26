package com.spring.basic;

import java.util.List;

public class Circle {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	private List<Point> points;
	
	public List<Point> getPoints() {
		return points;
	}
	public void setPoints(List<Point> points) {
		this.points = points;
	}
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void draw() {
		System.out.println(getPointA().getX());
		System.out.println(getPointB().getX());
		System.out.println(getPointC().getY());
		
		// printing list :
		for(Point p : points) {
			System.out.println("x : "+p.getX() + " y : "+p.getY());
		}
	}
	
}
