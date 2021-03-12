package com.spring.basic;

import java.util.List;

public class SpringInheritanceSubclass {

	// For Dependency
	private SpringInhertanceDemo springInhertanceDemo;
	private SpringInhertanceDemo springInhertanceDemo2;
	private SpringInhertanceDemo springInhertanceDemo3;

	// For List
	private List<SpringInhertanceDemo> spIdList;

	public SpringInhertanceDemo getSpringInhertanceDemo() {
		return springInhertanceDemo;
	}

	public void setSpringInhertanceDemo(SpringInhertanceDemo springInhertanceDemo) {
		this.springInhertanceDemo = springInhertanceDemo;
	}

	public SpringInhertanceDemo getSpringInhertanceDemo2() {
		return springInhertanceDemo2;
	}

	public void setSpringInhertanceDemo2(SpringInhertanceDemo springInhertanceDemo2) {
		this.springInhertanceDemo2 = springInhertanceDemo2;
	}

	public SpringInhertanceDemo getSpringInhertanceDemo3() {
		return springInhertanceDemo3;
	}

	public void setSpringInhertanceDemo3(SpringInhertanceDemo springInhertanceDemo3) {
		this.springInhertanceDemo3 = springInhertanceDemo3;
	}

	public List<SpringInhertanceDemo> getSpIdList() {
		return spIdList;
	}

	public void setSpIdList(List<SpringInhertanceDemo> spIdList) {
		this.spIdList = spIdList;
	}

	public void showNames() {
		System.out.println("..Inhertance Demo..");
		System.out.println(springInhertanceDemo.getName());
		System.out.println(springInhertanceDemo2.getName());
//		System.out.println(springInhertanceDemo3.getName());		
	}
	
	public void showNameList() {
		System.out.println("..List Inhertance Demo..");
		for (SpringInhertanceDemo springInhertanceDemo : spIdList) {
			System.out.println(springInhertanceDemo.hashCode() + " " + springInhertanceDemo.getName());
		}
	}

}
