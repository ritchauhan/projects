package com.dev.interfaceDemo;

/**
 * 
 * @author rkumar
 *	Implementation class for interface demo
 */
public class InterfaceDemoImplemenation implements InterfaceDemo {
	
	@Override
	public String getName() {
//		name = "kumar"; /* final interface varibale can't be assigned */ 
		return name;
	}
	
	// Main Methods
	public static void main(String args[]) {
		InterfaceDemoImplemenation demo = new InterfaceDemoImplemenation();
		System.out.println("name: "+demo.getName());
	}

}
