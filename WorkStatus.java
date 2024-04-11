package com.chainsys.day3;

import java.util.Scanner;

public class WorkStatus {
	/*Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using 
following rules print their place of service.
if employee is female, then she will work only in urban areas.

if employee is a male and age is in between 20 to 40 then he may work in anywhere

if employee is male and age is in between 40 t0 60 then he will work in urban areas only.

And any other input of age should print "ERROR".*/


	public static void main(String[] args) {
		int age = 0;
        char sex;
        char MaritalStatus;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        age = sc.nextInt();
        if (age > 0) {
            System.out.println("Enter your Gender(F/M)");
            sex = sc.next().charAt(0);
            System.out.println("Are you Married?(Y/N)");
            MaritalStatus = sc.next().charAt(0);
            if (sex == 'F')
                System.out.println("Work in urban areas only");
            else if (sex == 'M' && (age >= 20 && age <= 40))
                System.out.println("Work anywhere");
            else if (sex == 'M' && (age >= 40 && age <= 60))
                System.out.println("Work in urban areas only");
            else if (age > 60 || (age < 20 && age >= 0))
                System.out.println("ERROR");
        } else
            System.out.println("INVALID INPUT");
    }

	}

