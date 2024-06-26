package com.chainsys.day3;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		//Check out what happens if we use logical operators(<,<=,>,>=,==)  and print the values
	int number1,number2;
	Scanner sc=new Scanner(System.in);
	{
	System.out.println("Enter the first number:");
	number1=sc.nextInt();
	System.out.println("Enter the second number:");
	number2=sc.nextInt();
	
	if(number1>=0 && number2>=0) {
		if(number1<number2)
	{
		System.out.println(+number1+ " is smaller than " +number2);
	}
	else
	{
		System.out.println(+number2+ " is smaller than " +number1);
	}
	if(number1<=number2)
	{
		System.out.println(+number1+ " is smaller than or equal to "+number2);
	}
	else
	{
		System.out.println(+number2+ " is smaller than or equal to "+number1);
	}
	if(number1>number2)
	{
		System.out.println(+number1+ " is bigger than " +number2);
	}
	else
	{
		System.out.println(+number2+ " is bigger than " +number1);
	}
	if(number1>=number2)
	{
		System.out.println(+number1+ " is bigger than or equal to "+number2);
	}
	else
	{
		System.out.println(+number2+ " is bigger than or equal to "+number1);
	}
	if(number1==number2)
	{
		System.out.println(+number1+ " and " +number2+ " are equal");
	}
	else
	{
		System.out.println(+number2+ " and " +number1+ " are not equal");
	}
	}
	else
	{
		System.out.println("INVALID INPUT, GIVE POSITIVE NUMBERS");
	}
	
	}
	}
}
