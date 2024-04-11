package com.chainsys.day3;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		int num;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();
        if (num > 0 && num <= 100) 
        {
        for (i =num; i <= 100; i++)
        {
                if (i % 3 == 0 && i % 5 == 0)
                    System.out.println("FizzBuzz");
                else if (i % 3 == 0)
                    System.out.println("Fizz");
                else if (i % 5 == 0)
                    System.out.println("Buzz");
                else
                    System.out.println(i);
            }
        }
        else
                System.out.println("INVALID DATA");

	}

}
