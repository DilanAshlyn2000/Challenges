package com.chainsys.day3;
import java.util.Scanner;
public class BonusCalculation {
	public static void main(String[] args) {
	String emp_name;
	int id,year_of_service;
	int salary,bonus;
	Scanner sc=new Scanner(System.in);
	{
	System.out.println("Enter the name of the Employee:");
	emp_name= sc.nextLine();
	System.out.println("Enter the id of the Employee:");
	id=sc.nextInt();
	System.out.println("Enter the year of service:");
	year_of_service=sc.nextInt();
	System.out.println("Enter the Salary:");
	salary=sc.nextInt();
	System.out.println("EMPLOYEE NAME          : "+emp_name);
	System.out.println("EMPLOYEE ID            : "+id);
	System.out.println("YEAR OF SERVICE        : "+year_of_service);
	if(year_of_service > 0)
		if(year_of_service>5)
	{
	bonus=salary*5/100;
	System.out.println("SALARY                 : " +salary);
	salary=salary+bonus;
	System.out.println("BONUS                  : " +bonus);
	System.out.println("SALARY AFTER BONUS     : " +salary);
	}
	else{
	System.out.println("SALARY                 : "+salary);
	}
	else{
		System.out.println("INVALID DATA, YEAR OF SERVICE IS GIVEN IN NEGATIVE NUMBER");
	}
		}}}
