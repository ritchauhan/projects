package com.dev.interPrep;

/**
 * To convert binary to decimal
 * @author rikumar
 *
 */
public class BinaryToDecimal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = toDecimal(11100);
		System.out.println(result);
	}
	
	static int toDecimal(int binaryNum) {
		
		int temp = binaryNum;
		int base = 1;
		int result = 0;
		
		while (temp > 0) {
			int mod = temp % 10;
			temp = temp / 10;
			result = result + mod * base;
			base = base * 2;
		}
		return result;
	}	

}
