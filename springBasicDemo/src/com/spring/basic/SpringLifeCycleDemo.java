package com.spring.basic;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SpringLifeCycleDemo implements BeanNameAware, InitializingBean, DisposableBean{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("initialization starts here ...");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("deletion starts here ...");
	}
	
	public void init() {
		System.out.println("custom initialization method: ");
	}
	
	public void customDestroy() {
		System.out.println("custom deletion method: ");
	}
	
	public void globalInit() {
		System.out.println("global initialization method: ");
	}
	
	public void globalDestroy() {
		System.out.println("global deletion method: ");
	}

}
