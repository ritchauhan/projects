package com.dev.innerClasses;

/**
 * class to get object of inner and outer class
 * @author rkumar
 *
 */
public class InnerClassObjectDemo {
	
	/**
	 * 
	 */
	public void seeInner() {
		InnerOfInner inner = new InnerOfInner();
		inner.getInstanceValue();
		// AudioSystem.getLine(info);
	}
	
	/**
	 * 
	 * @author rkumar
	 * method to print inner and outer class objects 
	 *
	 */
	class InnerOfInner {
		/**
		 * 
		 */
		public void getInstanceValue() {
			System.out.println("Object of inner class : "+this);
			System.out.println("Object of outer class: "+InnerClassObjectDemo.this);
		}
	}
	
	/**
	 * main test method
	 * @param args
	 */
	public static void main(String args[]) {
		InnerClassObjectDemo innerClassObjectDemo = new InnerClassObjectDemo();
		innerClassObjectDemo.seeInner();
	}

}
