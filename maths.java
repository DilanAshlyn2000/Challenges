package com.chainsys.day3;

import java.util.Scanner;

public class maths {
	//calling a method
	static void oddEven() {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		number = sc.nextInt();
		if (number % 2 == 0)
			System.out.println(number + " is even");
		else
			System.out.println(number + " is odd");
	}

	static void leapCheck() {
		int number1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		number1 = sc.nextInt();

		if (number1 % 4 == 0)
			System.out.println(number1 + " is a leap year");
		else
			System.out.println(number1 + " is not a leap year");
	}

	public static void main(String[] args) {
		oddEven();
		leapCheck();

	}
}
