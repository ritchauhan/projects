package com.dev.interPrep;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toBinary(100);
	}
	
	static void toBinary(int decimalNo) {
		
		int[] arr = new int[10];
		int temp = decimalNo;
		int i = 0;
		
		System.out.println(decimalNo >> 31);
		
		while(temp > 0) {
			int mod = temp % 2;
			arr[i] = mod;
			temp = temp / 2;
			i++;
		}
		
		for (int j = arr.length-1; j >= 0; j-- ) {
			System.out.print(arr[j]);
		}
		
	}

}
