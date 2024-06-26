package com.chainsys.day4;

import java.util.Scanner;
import java.util.regex.*;
public class SpaceRegex {

	public static void main(String[] args) {
		
		 String regex = "\\s";
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter a string to check spaces: ");
	     String input = sc.nextLine();
	     Pattern pattern = Pattern.compile(regex);
	     Matcher m = pattern.matcher(input);
	     int count=0;
	     while(m.find())
	     {
	        count ++;
	     }
	     System.out.println("Number of spaces in the sentence is: "+count);
	   }
	}
