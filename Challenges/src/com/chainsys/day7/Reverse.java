package com.chainsys.day7;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    {
	    System.out.println("ENTER A STRING:");
	    String originalString=sc.nextLine();
		StringBuilder reversedString = new StringBuilder();
		reversedString.append(originalString);
		reversedString = reversedString.reverse();
		System.out.println("GIVEN STRING: " + originalString);
		System.out.println("REVERSED STRING: " + reversedString.toString());

	}
	}
}
