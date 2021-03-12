package com.spring.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircleTest {

	public static void main(String[] args) {
		ApplicationContext context1 = new ClassPathXmlApplicationContext("spring.xml");
		Circle circle1 = (Circle) context1.getBean("circle");
		// TODO Auto-generated method stub
		circle1.ShowContextValues();
	}

}
