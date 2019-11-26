package com.dev.pattern.bridgePattern;

public class Bike extends Vehchile {

	protected Bike(Workshop workShop1, Workshop workShop2) {
		super(workShop1, workShop2);
	}

	protected void manufacture() {

		System.out.println("Bike Implementation ");

		workshop1.work();
		workshop2.work();
	}

}
