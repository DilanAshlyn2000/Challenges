package com.chainsys.day7;

import java.util.Scanner;

public class PalindromeChecker {

	    public static boolean isPalindrome(String str) {
	        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	        int left = 0, right = cleaned.length() - 1;
	        while (left < right) {
	            if (cleaned.charAt(left) != cleaned.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        scanner.close();

	        if (isPalindrome(input)) {
	            System.out.println("'" + input + "' is a palindrome.");
	        } else {
	            System.out.println("'" + input + "' is not a palindrome.");
	        }
	    }
	}

