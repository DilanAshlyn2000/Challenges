package com.chainsys.day3;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        number= sc.nextInt();
        if (number > 0) {
            if (number % 2 == 0)
                System.out.println(number + " is even");
            else
                System.out.println(number + " is odd");
            System.out.println("Cube of that num is:" + number * number * number);
        } else
            System.out.println("INVALID INPUT");
    }
		
}
