package com.chainsys.day4;
import java.util.Scanner;
import java.util.regex.*;
public class PhoneNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		{
			System.out.println("Enter the phone number:");
			String phoneNumber=sc.next();
	        String regex = "^\\d{5}\\d{5}$";
	 
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(phoneNumber);
	 
	        boolean isPhoneValid = matcher.matches();
	 
	        if (isPhoneValid) {
	            System.out.println("PHONE NUMBER IS VALID");
	        }
	        else {
	            System.out.println("PHONE NUMBER IS INVALID");
	        }
		}
	}

}
