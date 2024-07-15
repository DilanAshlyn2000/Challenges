package com.chainsys.day7;

import java.util.Scanner;

public class VowelConsonantCounter {

	    public static void countVowelsAndConsonants(String[] array) {
	        for (String str : array) {
	            int vowelCount = 0;
	            int consonantCount = 0;
	            str = str.toLowerCase();
	            String vowels = "aeiou";
	            for (int i = 0; i < str.length(); i++) {
	                char ch = str.charAt(i);
	                if (Character.isLetter(ch)) {
	                    if (vowels.indexOf(ch) != -1) {
	                        vowelCount++;
	                    } else {
	                        consonantCount++;
	                    }
	                }
	            }
	            System.out.println("String: " + str);
	            System.out.println("Total vowels: " + vowelCount);
	            System.out.println("Total consonants: " + consonantCount);
	            System.out.println();
	        }
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of strings: ");
	        int n = scanner.nextInt();
	        scanner.nextLine();
	        String[] array = new String[n];
	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter string #" + (i + 1) + ": ");
	            array[i] = scanner.nextLine();
	        }
	        scanner.close();
	        countVowelsAndConsonants(array);
	    }
	}




