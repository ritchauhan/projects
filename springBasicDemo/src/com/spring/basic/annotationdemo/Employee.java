package com.spring.basic.annotationdemo;

import org.springframework.beans.factory.annotation.Required;

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

	@Required
	public void setAddress(Address address) {
		this.address = address;
	}

	
	
	public void showAddress() {
		System.out.println(" City : "+address.getCity() + " PinCode : "+address.getPincode());
	}
}
