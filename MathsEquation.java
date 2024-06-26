package com.chainsys.day3;

public class MathsEquation {

	public static void main(String[] args) {
		System.out.println("THE GIVEN EQUATION : 2y2 + y + 5");
		System.out.println("\n");
		for (int i = 5; i <= 10; i++) {
            double result = solveEquation(i);
            System.out.println("For y = " + i + ", RESULT: " + result);
        }
    }
    public static double solveEquation(int i) {
        double result = 2 * Math.pow(i, 2) + i + 5;
        return result;

	}

}
