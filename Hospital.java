package com.chainsys.day2;

import java.util.Scanner;

public class Hospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String patientname,location,phonenumber,bloodgroup;
		int id,age;
		Scanner sc = new Scanner(System.in);
		{
			System.out.println("Enter the name of the patient:");
			patientname= sc.nextLine();
			System.out.println("Enter the patient id:");
			id=sc.nextInt();
			System.out.println("Enter the patient age:");
			age=sc.nextInt();
			System.out.println("Enter the Blood group:");
			bloodgroup=sc.next();
			System.out.println("Enter the patient's phone number:");
			phonenumber=sc.next();
			System.out.println("Enter the Location:");
			location=sc.next();
			System.out.println("   PATIENT ADMISSION FORM");
			System.out.println("-----------------------------");
			System.out.println( " NAME             :" +patientname);
			System.out.println( " PATIENT ID       :" +id);
			System.out.println( " AGE              :" +age);
			System.out.println( " BLOOD GROUP      :" +bloodgroup);
			System.out.println( " PHONE NUMBER     :" +phonenumber);
			System.out.println( " LOCATION         :" +location);
			
		}

	}
}
