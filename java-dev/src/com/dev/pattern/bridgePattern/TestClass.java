package com.dev.pattern.bridgePattern;

public class TestClass {
	
	public static void main(String args[]) {
		
		Vehchile vehchile = new Car(new Produce(), new Assembled());
		vehchile.manufacture();
		Vehchile vehchile1 = new Bike(new Produce(), new Assembled());
		vehchile1.manufacture();

	}
}
