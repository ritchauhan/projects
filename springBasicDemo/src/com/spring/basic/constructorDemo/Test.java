package com.spring.basic.constructorDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ConstructDemo.xml");
		System.out.println(applicationContext.containsBean("horse"));
		Horse horse = (Horse) applicationContext.getBean("horse");
		System.out.println(horse.getColor() + " : " + horse.getTailSize());
	}

}
