package com.chainsys.day4;
import java.util.Scanner;
import java.util.regex.*;  
public class RegexPrograms {

	public static void main(String[] args) {
		
		//single non-digit
		System.out.println(Pattern.matches("\\D", "wow"));  
		System.out.println(Pattern.matches("\\D", "7"));
		System.out.println(Pattern.matches("\\D", "4b43"));  
		System.out.println(Pattern.matches("\\D", "ABC")); 
		System.out.println(Pattern.matches("\\D", "m"));  
		System.out.println("\n");
		
		//non-digit once or more than one time
		System.out.println(Pattern.matches("\\D*", "lyn"));
		System.out.println("\n");
		
	    //single character present or not
		System.out.println(Pattern.matches("[apple]", "app"));
		System.out.println(Pattern.matches("[apple]", "a"));
		System.out.println(Pattern.matches("[apple]", "apple"));
		System.out.println("\n");
	    
		//negation
		System.out.println(Pattern.matches("[^apple]", "ale"));
		System.out.println(Pattern.matches("[^apple]", "b"));
		System.out.println(Pattern.matches("[^apple]", "app"));
		System.out.println("\n");
		
		//accepts alphanumeric characters and length should be 8
		System.out.println(Pattern.matches("[a-zA-Z0-9]{8}", "Welcome#654"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{8}", "Cat32"));  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{8}", "JOhnUk2"));  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{8}", "Welcom$2"));
		System.out.println("\n");
		
		//metacharacter .
		System.out.println(Pattern.matches("..t", "bat"));
		System.out.println(Pattern.matches(".o.", "mom"));
		System.out.println(Pattern.matches("....y", "hd7j"));  
		System.out.println(Pattern.matches("s..", "saw")); 
		System.out.println(Pattern.matches("..1", "101"));  
		System.out.println(Pattern.matches("m..", "m77")); 
		System.out.println("\n");
		
		//whitespace 
		System.out.println(Pattern.matches("\s", " "));   
	    System.out.println(Pattern.matches("\s", "9"));
	    System.out.println(Pattern.matches("\s", "	"));   
	    System.out.println(Pattern.matches("\s", "	3"));
	    System.out.println("\n");
	    
	    //word character which accepts both lower and uppercase and digits from 0 to 9
	    System.out.println(Pattern.matches("\\w", "a"));
	    System.out.println(Pattern.matches("\\w", "Z"));  
	    System.out.println(Pattern.matches("\\w", "0"));  
	    System.out.println(Pattern.matches("\\w", "76"));  
	    System.out.println(Pattern.matches("\\w", "$"));
	    System.out.println("\n");
	    
	    //accepts anything except alphabets and digits
	    System.out.println(Pattern.matches("\\W", "a"));
	    System.out.println(Pattern.matches("\\W", "Z"));  
	    System.out.println(Pattern.matches("\\W", "0"));  
	    System.out.println(Pattern.matches("\\W", "*"));  
	    System.out.println(Pattern.matches("\\W", "$"));
	    System.out.println("\n");
	    
		
	}
}