package com.chainsys.day7;

import java.util.Scanner;
// Fibonacci Calculation with User Input
public class FibonacciUserInput {

	    public static int fibonacci(int n) {
	        if (n <= 1) {
	            return n;
	        }
	        
	        int a = 0, b = 1;
	        for (int i = 2; i <= n; i++) {
	            int next = a + b;
	            a = b;
	            b = next;
	        }
	        
	        return b;
	    }

	    public static void generateFibonacciSeries(int n) {
	        if (n <= 0) {
	            System.out.println("Please enter a positive integer.");
	            return;
	        }
	        
	        int a = 0, b = 1;
	        System.out.print("First " + n + " Fibonacci numbers: ");
	        
	        for (int i = 0; i < n; i++) {
	            if (i == 0) {
	                System.out.print(a + " ");
	            } else if (i == 1) {
	                System.out.print(b + " ");
	            } else {
	                int next = a + b;
	                System.out.print(next + " ");
	                a = b;
	                b = next;
	            }
	        }
	        System.out.println(); 
	    }

	    // Main method to get input from the user and compute Fibonacci numbers
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        
	        System.out.print("Enter a integer to get the Fibonacci number at that position: ");
	        int position = scanner.nextInt();
	        if (position < 0) {
	            System.out.println("Please enter a integer.");
	        } else {
	            System.out.println("Fibonacci number at position " + position + " is: " + fibonacci(position));
	        }

	        System.out.print("Enter a positive integer to generate the first N Fibonacci numbers: ");
	        int count = scanner.nextInt();
	        generateFibonacciSeries(count);

	        scanner.close();
	    }
	}


