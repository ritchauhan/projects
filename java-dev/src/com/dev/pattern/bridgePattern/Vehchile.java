package com.dev.pattern.bridgePattern;

public abstract class Vehchile {
	
	protected Workshop workshop1;
	protected Workshop workshop2;
	
	protected Vehchile(Workshop workShop1, Workshop workShop2) {
		this.workshop1 = workShop1;
		this.workshop2 = workShop2;
	}
	
	protected abstract void manufacture();
}
