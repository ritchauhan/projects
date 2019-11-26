package com.dev.basic;

public class PassByValueDemo1 {
	
	public static void main(String [] args) {
		
		Demo1 demo1 = new Demo1();
		demo1.setName("chauhan");
		
		System.out.println("before name : "+demo1.getName());
		Demo demo = new Demo();
		demo.show(demo1);
		
		System.out.println("after name : "+demo1.getName());
		
		demo.getname();
		
	}
	
}

class Demo {
	
	public void show(Demo1 demo1) {
		demo1.setName("kumar");
	}
	
	public void getname() {
		Demo1 demo1 = new Demo1();
		System.out.println("name : "+demo1.getName());
	}
}

class Demo1 {
	
	private String name = "ritesh";
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}