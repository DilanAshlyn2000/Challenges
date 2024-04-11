package com.chainsys.day2;

import java.util.Scanner;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int firstnumber,secondnumber,sum,difference,product,quotient,modulus,increment,number;
		Scanner sc = new Scanner(System.in);
		{

			System.out.println("Enter the First Number:");
			firstnumber= sc.nextInt();
			System.out.println("Enter the Second Number:");
			secondnumber=sc.nextInt();
			sum=firstnumber+secondnumber;
			difference=firstnumber-secondnumber;
			product=firstnumber*secondnumber;
			quotient=firstnumber/secondnumber;
			modulus=firstnumber%secondnumber;
			System.out.println("------------------------------------------------------------------------");
			System.out.println("ARITHMETIC OPERATORS:");
			System.out.println("The sum of "+firstnumber+ " and " +secondnumber+ " is " +sum);
			System.out.println("The difference of "+firstnumber+ " and " +secondnumber+ " is " +difference);
			System.out.println("The product of "+firstnumber+ " and " +secondnumber+ " is " +product);
			System.out.println("The quotient of "+firstnumber+ " and " +secondnumber+ " is " +quotient);
			System.out.println("The modulus of "+firstnumber+ " and " +secondnumber+ " is " +modulus);
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("RELATIONAL OPERATORS:");
			System.out.println("firstnumber>secondnumber:" +(firstnumber>secondnumber));
			System.out.println("firstnumber<secondnumber:" +(firstnumber<secondnumber));
			System.out.println("firstnumber>=secondnumber:" +(firstnumber>=secondnumber));
			System.out.println("firstnumber<=secondnumber:" +(firstnumber<=secondnumber));
			System.out.println("firstnumber==secondnumber:" +(firstnumber==secondnumber));
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("LOGICAL OPERATOR:");
			System.out.println((8 > 3) && (7 > 6)); 
			System.out.println((8 > 3) && (7 < 6)); 
			System.out.println((8 < 3) || (7 > 6)); 
			System.out.println((8 > 3) || (7 < 6)); 
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("UNARY OPERATOR:");
			System.out.println("The value of the number "+firstnumber);
			increment = ++firstnumber;
			System.out.println("After increment: " + increment);
			System.out.println("------------------------------------------------------------------------");
			System.out.println("ASSIGNMENT OPERTOR:");
			name="Kayal";
			number=1000;
			System.out.println("The number assigned is " +number);
			System.out.println("The name assigned is " +name);
			System.out.println("------------------------------------------------------------------------");
		}
	}

}
