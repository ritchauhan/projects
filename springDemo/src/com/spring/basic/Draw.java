package com.spring.basic;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class Draw {

	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Traingle traingle = new Traingle();
		
		// Spring Bean Factory: 
		// Xml file needs to be there in root path
		// BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		
		applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Traingle traingle = (Traingle) applicationContext.getBean("traingle-name");
//		traingle.draw();
		
		// Object Injection
		Circle circle = (Circle) applicationContext.getBean("circle-alias");
//		circle.draw();
		
		// AutoWire 
		AutowireDemo autowireDemo = (AutowireDemo) applicationContext.
				getBean("autowiredemo");
		autowireDemo.draw();
	}

}
