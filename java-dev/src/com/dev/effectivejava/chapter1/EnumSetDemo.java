package com.dev.effectivejava.chapter1;

import java.util.EnumSet;

enum EnumSetDemoEnum {
	
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	
}

public class EnumSetDemo {
	
	EnumSet weekend = EnumSet.of(EnumSetDemoEnum.FRIDAY
			, EnumSetDemoEnum.SATURDAY, EnumSetDemoEnum.SUNDAY);
	
	public static void main(String args[]) {
		EnumSetDemo enumSetDemo = new EnumSetDemo();
		System.out.println("weekend : "+enumSetDemo.weekend.toString());
		
	}
}