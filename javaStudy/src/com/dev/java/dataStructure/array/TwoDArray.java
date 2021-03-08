package com.dev.java.dataStructure.array;

public class TwoDArray {

    private static boolean getResult(int[][] matrix, int target) {
        int rowLength = matrix.length;
        int columnLength = matrix[0].length;
        // brute force method
        for (int i=0; i<rowLength; i++) {
            for (int j=0; j<columnLength; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
                if (matrix[i][j] > target) {
                    break;
                }
                System.out.println(matrix[i][j]);
            }
        }
        return false;
    }

    /**
     * this will break for negative cases.
     * @param matrix
     * @param target
     * @return
     */
    private static boolean getOptimalResult(int[][] matrix, int target) {
        System.out.println(matrix.length);
        if (matrix.length == 0) {
            return false;
        }
        int rowLength = matrix.length;
        int columnLength = matrix[0].length;
        int row = rowLength-1;
        int col = 0;
        while (row >= 0 && col < columnLength ) {
            System.out.println(matrix[row][col]);
            if (matrix[row][col] > target) {
                row--;
            } else if (matrix[row][col] < target) {
                col++;
            } else {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24 },
                {18, 21, 23, 26, 30}
        };
        int[][] matrix1 = {{-5}};
//        boolean result = getResult(matrix, 20);
        boolean optimalResult = getOptimalResult(matrix1, -5);
        System.out.println(optimalResult);
    }
}
