package com.spring.basic;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.spring.basic.interacedemo.Shape;

public class Circle implements ApplicationContextAware, BeanNameAware, Shape {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context = null;
	
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
	
	public void showTestBeanScope() {
		TestBeanScope testBeanScope = (TestBeanScope) this.context.getBean("testBeanScope");
		testBeanScope.show();
	}
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		
		this.context = context;
		
	}
	
	public void ShowContextValues() {
		System.out.println(this.context);
		Point p = (Point)this.context.getBean("pointA");
		System.out.println(p.getX());
		
	}
	
	@Override
	public void setBeanName(String beanName) {
		
		System.out.println("Bean Name is: "+beanName);
		
	}
	
}
