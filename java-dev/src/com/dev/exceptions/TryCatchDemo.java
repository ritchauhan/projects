package com.dev.exceptions;

import java.io.File;

public class TryCatchDemo {
	
	protected void multipleCatchExceptionDemo() {
		
		try {
			// arithmetic exception
			int a = 10;
			int b = 0;
			int result = a/b;
			System.out.println(result);
			// array index out of bound exception
			int d[] = {10, 20, 30};
			for (int val : d) {
				System.out.println(d[3]);
			}
//		} 
//		catch (ArithmeticException artArithmeticException) {
//			System.out.println(artArithmeticException);
//		} catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
//			System.out.println(arrayIndexOutOfBoundsException);
//		}
	} finally {
		// do something
	}
}
}
