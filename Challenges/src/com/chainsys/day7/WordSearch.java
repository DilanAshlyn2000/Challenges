package com.chainsys.day7;

	import java.util.Scanner;

	public class WordSearch {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a sentence or text: ");
	        String text = scanner.nextLine();

	        System.out.print("Enter the word to search for: ");
	        String wordToSearch = scanner.next();

	        String[] words = text.split("\\s+");
	        boolean found = false;

	        for (String word : words) {
	            if (word.equalsIgnoreCase(wordToSearch)) {
	                found = true;
	                break;
	            }
	        }

	        if (found) {
	            System.out.println("The word \"" + wordToSearch + "\" was found in the text.");
	        } else {
	            System.out.println("The word \"" + wordToSearch + "\" was not found in the text.");
	        }

	        scanner.close();
	    }
	}


