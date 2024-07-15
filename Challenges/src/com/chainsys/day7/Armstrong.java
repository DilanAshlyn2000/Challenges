package com.chainsys.day7;

	import java.util.Scanner;
	public class Armstrong {
		//An Armstrong number is a whole number that’s equal to the sum of its digits raised to the power of the total number of digits. For example, 153 is an Armstrong number because there are three digits, and 153 = 13 + 53 + 33. The four-digit number 8208 is also an Armstrong number, as 8208 = 84 + 24 + 04 + 84.
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();
	       
	        if (isArmstrong(number)) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }
	    }

	    public static boolean isArmstrong(int number) {
	        int originalNumber = number;
	        int numDigits = String.valueOf(number).length();
	        int sum = 0;

	        while (number > 0) {
	            int digit = number % 10;
	            sum += Math.pow(digit, numDigits);
	            number /= 10;
	        }
	        return sum == originalNumber;
	    }
	}

