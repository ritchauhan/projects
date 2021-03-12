package fileIO;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// Scanner demo
		inputScan();

	}
	
	static void inputScan() {
		Scanner sc = null;
		// for normal string scan
		/**
		try {
			sc =  new Scanner(new BufferedReader(new FileReader("test.txt")));
			while (sc.hasNext()) {
				System.out.println(sc.next());
			}
		} catch (IOException ioException) {
			ioException.printStackTrace();
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
		**/
		// for decimal
		try {
			sc =  new Scanner(new BufferedReader(new FileReader("decimal.txt")));
			Double sum = 0.0;
			while (sc.hasNextDouble()) {
				sum += sc.nextDouble();
				System.out.println(sum);
			}
		} catch (IOException ioException) {
			ioException.printStackTrace();
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

}
