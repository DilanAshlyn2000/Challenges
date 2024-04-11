package com.chainsys.day3;

import java.util.Scanner;

public class MultiplicationTables {

	public static void main(String[] args) {
		int number;
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter number:");        
		 number=sc.nextInt();
		        if(number>0)
		        	{
		        	for(int i=1; i <= 10; i++)
		            System.out.println(number+" * "+i+" = "+number*i);
		        	}
		        else
		        	{
		        		System.out.println("INVALID INPUT");
		        	}
		        	}
}
