package com.chainsys.day4;

import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String name,text,text1="bat";
	        Scanner sc=new Scanner(System.in);
	        System.out.println("ENTER THE NAME:");
	        name=sc.next();
	        System.out.println("ENTER A WORD:");
	        text=sc.next();
	        //returns the char value of the mentioned index
	        System.out.println(name.charAt(0));
	        //checks whether it starts with the mentioned characters
	        System.out.println(name.startsWith("RA")); 
	        System.out.println(name.startsWith("AB")); 
	        //changes to upper and lower case
	        System.out.println(text.toUpperCase());
	        System.out.println(text.toLowerCase());
	        //replaces the mentioned character of the string
	        System.out.println((text1.replace('b', 'c')));
	        //gives the length of the string
	        System.out.println(name.length());
	        //returns the current string without any changes
	        String statement = new String("BE KIND"); 
	        System.out.print("QUOTE OF THE DAY:"); 
	        System.out.println(statement.toString()); 
	        //repeats the given string
	        String string="wow"; 
	        int count=5;  
	        System.out.println("Repeated String :"+string.repeat(count)); 
	        //comparing two strings
	        String flower1 = "Rose";
	        String flower2 = "Rose";
	        System.out.println(flower1.compareTo(flower2));
	        // returns true if same and false if different
	        String animal1 = "Dog";
	        String animal2 = "Dog";
	        String animal3 = "Cat";
	        System.out.println(animal1.equals(animal2)); 
	        System.out.println(animal1.equals(animal3));
	        //concating two strings
	        String one = "HELLO ";
	        String two = "EVERYONE!";
	        String concatString = one.concat(two);
	        System.out.println("First String: " + one);
	        System.out.println("Second String: " + two);
	        System.out.println("Joined String: " + concatString);
	       //trim the spaces
	        String word="      HELLO        ";
	        System.out.println(word.trim());
	        //empty
	        System.out.println(word.isEmpty());
	}

}
