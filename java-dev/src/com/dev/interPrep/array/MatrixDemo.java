package com.dev.interPrep.array;

public class MatrixDemo {
	
	/**
	 * print matrix
	 */
	static void printMatrix(int[][] matrix) {
		int rowLength = matrix.length;
		int columnLen = matrix[0].length;
		for (int i=0; i<rowLength; i++) {
			for (int j=0; j<columnLen; j++) {
				System.out.print(matrix[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
	/**
	 * sort matrix
	 * @param matrix
	 */
	static void sortMatrix(int[][] matrix) {
		int rowLength = matrix.length;
		int columnLen = matrix[0].length;
		int temp = 0;
		for (int i=0; i<rowLength; i++) {
			for (int j=0; j<columnLen; j++) {
				
			}
		}
	}
	
	/**
	 * Test Method
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
				{5, 6, 7},
				{4, 1, 8},
				{9, 3, 2},
				{10, 12, 13}
		};
	 // print the matrix
		printMatrix(matrix);
	}
}
