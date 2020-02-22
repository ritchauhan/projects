package com.spring.basic.interacedemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author rikumar
 *
 */
public class InterfaceTest {

	public static ApplicationContext applicationContext;
	
	public static void main(String[] args) {
		applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Shape shape = (Shape) applicationContext.getBean("traingle-name");
		shape.draw();
	}

}
