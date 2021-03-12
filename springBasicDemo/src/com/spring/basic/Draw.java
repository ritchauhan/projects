package com.spring.basic;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Draw {

	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Traingle traingle = new Traingle();
		
		// Spring Bean Factory: 
		// Xml file needs to be there in root path
		// BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		
		applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		boolean isbean = applicationContext.containsBean("testBeanScope");
		System.out.println("is bean : "+isbean);
//		Traingle traingle = (Traingle) applicationContext.getBean("traingle-name");
//		traingle.draw();
//		
		// Object Injection
		Circle circle = (Circle) applicationContext.getBean("circle-alias");
		circle.draw();
		
//		circle.showTestBeanScope();
		
		// AutoWire 
		
		Point point = (Point) applicationContext.getBean("pointD");
		System.out.println("value of x : "+point.getX());
		System.out.println("value of y : "+point.getY());
		
//		AutowireDemo autowireDemo = (AutowireDemo) applicationContext.
//				getBean("autowiredemo");
//		autowireDemo.draw();
		circle.ShowContextValues();
	}

}
