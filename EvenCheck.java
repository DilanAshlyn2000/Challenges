package com.chainsys.day3;

import java.util.Scanner;

public class EvenCheck {

	public static void main(String[] args) {
		int number,i;
		Scanner sc=new Scanner(System.in);{
			System.out.println("ENTER A NUMBER:");
		number=sc.nextInt();
		if(number>0)
		{
			for(i=1;i<=number;i++)
				if(i%2==0)
				{
					System.out.println(i);
				}
		}
		else
			System.out.println("INVALID DATA");
		}
	}
	}


