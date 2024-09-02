package com.chainsys.day7;

public class ReverseString {
	// Write a Java program to reverse a string without using the reverse method of Java’s String class
	    public static String reverse(String str) {
	        char[] charArray = str.toCharArray();
	        
	        int left = 0;
	        int right = charArray.length - 1;
	        
	        while (left < right) {
	            char temp = charArray[left];
	            charArray[left] = charArray[right];
	            charArray[right] = temp;
	            left++;
	            right--;
	        }

	        return new String(charArray);
	    }

	    public static void main(String[] args) {
	        String original = "Hello, World!";
	        String reversed = reverse(original);
	        
	        System.out.println("Original String: " + original);
	        System.out.println("Reversed String: " + reversed);
	    }
	}


