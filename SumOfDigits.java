package com.chainsys.day3;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		int n;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		{
			System.out.println("Enter the number:");
			n = sc.nextInt();
			if (n > 0) {
				while (n > 0) {
					int last = n % 10;
					sum = sum + last;
					n = n / 10;
				}
			} 
			else
			{
				System.out.println("INVALID INPUT");
			}
			System.out.println("SUM OF THE DIGITS= " + sum);

		}
	}
}
