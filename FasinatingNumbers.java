package com.chainsys.day3;

import java.util.Scanner;

public class FasinatingNumbers {

	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int n = scanner.nextInt();

         if (isFascinating(n)) {
             System.out.println(n + " is a fascinating number.");
         } else {
             System.out.println(n + " is not a fascinating number.");
         }
     }

     public static boolean isFascinating(int n) {
         String concatenated = Integer.toString(n) + Integer.toString(n * 2) + Integer.toString(n * 3);
         int[] count = new int[10];
         
         for (char c : concatenated.toCharArray()) {
             if (c == '0') return false; // If concatenated string contains any '0', it's not fascinating
             count[c - '0']++;
         }

         // Check if count array has exactly one occurrence of each digit from 1 to 9
         for (int i = 1; i <= 9; i++) {
             if (count[i] != 1) return false;
         }

         return true;
     
	}

}
