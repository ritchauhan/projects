package com.dev.pattern.bridgePattern;

public class Car extends Vehchile {

	protected Car(Workshop workShop1, Workshop workShop2) {
		super(workShop1, workShop2);
	}
	
	protected void manufacture() {
		
		System.out.println("Car Implementation ");
		
		workshop1.work();
		workshop2.work();
	}

}
