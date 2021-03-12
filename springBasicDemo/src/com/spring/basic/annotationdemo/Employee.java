package com.spring.basic.annotationdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private String name;
	private int empId;
	private Address address;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	
	public Address getAddress() {
		return address;
	}

//	@Required
	@Autowired
	@Qualifier(value="addr")
	public void setAddress(Address address) {
		this.address = address;
	}

	
	
	public void showAddress() {
		System.out.println(" City : "+address.getCity() + " PinCode : "+address.getPincode());
	}
	
	@PostConstruct
	public void initialize() {
		System.out.println("Initialize method of annotation implementation ..");
	}
	
	@PreDestroy
	public void destroyContruct() {
		System.out.println("Annotation destroy methods ..");
	}
}
