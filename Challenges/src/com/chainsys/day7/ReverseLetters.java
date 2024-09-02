package com.chainsys.day7;

	import java.util.Scanner;

	public class ReverseLetters {
//Reverse only the letters in a string
	    
	    public static String reverseLetters(String str) {
	        
	        StringBuilder letters = new StringBuilder();
	        for (char ch : str.toCharArray()) {
	            if (Character.isLetter(ch)) {
	                letters.append(ch);
	            }
	        }
	       
	        letters.reverse();
	        
	        StringBuilder result = new StringBuilder();
	        int letterIndex = 0;

	        for (char ch : str.toCharArray()) {
	            if (Character.isLetter(ch)) {
	                result.append(letters.charAt(letterIndex++));
	            } else {
	                result.append(ch);
	            }
	        }

	        return result.toString();
	    }

	   
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        scanner.close();
	        
	        String reversed = reverseLetters(input);
	        System.out.println("String with letters reversed: " + reversed);
	    }
	}


