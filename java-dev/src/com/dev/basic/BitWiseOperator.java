package com.dev.basic;

public class BitWiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showBitWiseOperator();
	}
	
	static void showBitWiseOperator() {
		int a = 5; // 0101
		int b = 10; // 1010
		
		System.out.println(" OR : "+ (a | b)); // 15
		System.out.println(" AND : "+ (a & b)); // 0
		System.out.println(" XOR : "+(a ^ b));  // 15
		System.out.println(" 2s Complimemnt: "+ (~a)); // -6
	}
}
