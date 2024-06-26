package com.chainsys.day3;

import java.util.Scanner;

public class DiscountCalculation {

	public static void main(String[] args) {
		int quantity,unit,cost = 0,discount;
		Scanner sc=new Scanner(System.in);
		{
			System.out.println("Enter the quantity:");
			quantity = sc.nextInt();
			unit = quantity * 100;
				if(quantity>0) {
					if (quantity >= 1000) 
					{
						discount = unit * 10 / 100;
						cost = unit - discount;
						System.out.println("Purchased Quantity = " + quantity);
						System.out.println("Original cost      = " + unit);
						System.out.println("10% Discount       = " + discount);
						System.out.println("Total cost         = " + cost);
					}
					else
					{
					   System.out.println("Purchased quantity = " + quantity);
						System.out.println("Total cost         = " + unit);
				}
				}
				else
				{
					System.out.println("INVALID DATA, GIVE POSITIVE NUMBER");
				}
		}
}
}
		
		
	

