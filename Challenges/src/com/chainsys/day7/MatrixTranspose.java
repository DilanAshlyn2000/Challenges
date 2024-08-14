package com.chainsys.day7;

import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows = scanner.nextInt();
		System.out.println("Enter the number of columns:");
		int cols = scanner.nextInt();

		int[][] matrix = new int[rows][cols];

		System.out.println("Enter matrix elements:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}

		int[][] transpose = transposeMatrix(matrix);

		System.out.println("Transpose of the matrix:");
		printMatrix(transpose);

		scanner.close();
	}

	public static int[][] transposeMatrix(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		int[][] transpose = new int[cols][rows];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				transpose[j][i] = matrix[i][j];
			}
		}

		return transpose;
	}

	public static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for (int transpose : row) {
				System.out.print(transpose + " ");
			}
			System.out.println();
		}
	}
}
