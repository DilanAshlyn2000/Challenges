package com.chainsys.day7;

import java.util.Scanner;

public class MatrixMultiplication {
	
	    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
	        int rows1 = matrix1.length;
	        int cols1 = matrix1[0].length;
	        int rows2 = matrix2.length;
	        int cols2 = matrix2[0].length;
	        
	        if (cols1 != rows2) {
	            throw new IllegalArgumentException("Not possible.");
	        }
	        
	        int[][] result = new int[rows1][cols2];
	        
	        for (int i = 0; i < rows1; i++) {
	            for (int j = 0; j < cols2; j++) {
	                result[i][j] = 0;
	                for (int k = 0; k < cols1; k++) {
	                    result[i][j] += matrix1[i][k] * matrix2[k][j];
	                }
	            }
	        }
	        
	        return result;
	    }

	    public static void printMatrix(int[][] matrix) {
	        for (int[] row : matrix) {
	            for (int elem : row) {
	                System.out.print(elem + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter the number of rows and columns for Matrix 1:");
	        int rows1 = scanner.nextInt();
	        int cols1 = scanner.nextInt();
	        int[][] matrix1 = new int[rows1][cols1];
	        
	        System.out.println("Enter the elements of Matrix 1:");
	        for (int i = 0; i < rows1; i++) {
	            for (int j = 0; j < cols1; j++) {
	                matrix1[i][j] = scanner.nextInt();
	            }
	        }
	        
	        System.out.println("Enter the number of rows and columns for Matrix 2:");
	        int rows2 = scanner.nextInt();
	        int cols2 = scanner.nextInt();
	        int[][] matrix2 = new int[rows2][cols2];
	        
	        System.out.println("Enter the elements of Matrix 2:");
	        for (int i = 0; i < rows2; i++) {
	            for (int j = 0; j < cols2; j++) {
	                matrix2[i][j] = scanner.nextInt();
	            }
	        }
	        
	        try {
	            int[][] result = multiplyMatrices(matrix1, matrix2);
	            System.out.println("Product:");
	            printMatrix(result);
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }
	        
	        scanner.close();
	    }
	}


