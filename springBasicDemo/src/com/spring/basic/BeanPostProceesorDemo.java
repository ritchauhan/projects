package com.spring.basic;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProceesorDemo implements BeanPostProcessor {
	
	public Object postProcessBeforeInitialization(Object bean,
            String beanName)
     throws BeansException {
		System.out.println("Before bean init : "+beanName);
		return bean;
	}
	
	public Object postProcessAfterInitialization(Object bean,
            String beanName)
     throws BeansException {
		System.out.println("After bean init : "+beanName);
		return bean;
	}
     
}
