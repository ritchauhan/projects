package com.spring.basic;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLifeCycleTestClass {
	
	private static AbstractApplicationContext applicationContext;

	public static void main(String args[]) {
		applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		applicationContext.registerShutdownHook();
		SpringLifeCycleDemo springLifeCycleDemo = 
				(SpringLifeCycleDemo) applicationContext.getBean("lifecycleDemo");
		System.out.println(springLifeCycleDemo.getName());
	}
}
