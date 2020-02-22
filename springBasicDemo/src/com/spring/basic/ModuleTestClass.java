package com.spring.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ModuleTestClass {
	
	private static ApplicationContext applicationContext;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		applicationContext = new ClassPathXmlApplicationContext("SpringInheritanceDemo.xml");
		
		// inheritance demo
		SpringInheritanceSubclass springInheritanceSubclass = 
				(SpringInheritanceSubclass) applicationContext.getBean("subchild");
		springInheritanceSubclass.showNames();
		
		//list inheritance demo
		SpringInheritanceSubclass springInheritanceSubclass1 = 
				(SpringInheritanceSubclass) applicationContext.getBean("list2");
		springInheritanceSubclass1.showNameList();
		
		
	}

}
