package com.chainsys.day4;

import java.util.Scanner;
import java.util.regex.*;

public class RegexDot {

	public static void main(String[] args) {
		String regex = "..t";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 input strings: ");
		String input[] = new String[5];
		for (int i = 0; i < 5; i++) 
		{
			input[i] = sc.nextLine();
		}

		Pattern pattern = Pattern.compile(regex);
		System.out.println("Three letter words that ends with t are: ");
		for (int i = 0; i < 5; i++) 
		{
			Matcher m = pattern.matcher(input[i]);
			if (m.matches()) 
			{
				System.out.println(m.group());
			}
		}

	}

}
