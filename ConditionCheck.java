package com.chainsys.day3;

import java.util.Scanner;

public class ConditionCheck {

	public static void main(String[] args) {
		// Check out, what happens when the if-else condition is ended with a semicolon
		int number1,number2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number:");
        number1= sc.nextInt();
        System.out.print("Enter a second number:");
        number2= sc.nextInt();
		if(number1>0 && number2>0);
			if(number1>number2)
        {
        	System.out.println(number1+ " is bigger than " +number2);
        }
        else
        {
        	System.out.println(number1+ " is not bigger than " +number2);
        }
		else
		{
			System.out.println("INVALID DATA");
		}
		}
}
