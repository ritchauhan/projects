package com.spring.basic.annotationdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoTest {
	
	static AbstractApplicationContext applicationContext;
	public static void main(String[] args) {
		
		applicationContext = new ClassPathXmlApplicationContext("AnnotationsDemo.xml");
		applicationContext.registerShutdownHook();
		Employee employee = (Employee) applicationContext.getBean("employee");
		employee.showAddress();
	}

}
