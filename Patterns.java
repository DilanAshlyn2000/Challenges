package com.chainsys.day3;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		
		int number,i,j;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        number=sc.nextInt();
        if(number>0)
        {
	        for(i=1;i<=number;i++)
	        {
	            for(j=1;i>=j;j++)
	            {
	                System.out.print("*");
	            }
	            System.out.println(" ");
	        }
        }
	        else{
            System.out.println("INVALID INPUT, GIVE POSITIVE NUMBER");
        }
        }
	}