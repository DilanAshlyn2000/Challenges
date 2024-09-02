package com.chainsys.day7;

public class ConsecutiveNumbers {

	    public static boolean areConsecutive(int[] numbers) {
	        if (numbers == null || numbers.length < 2) {
	            return false; 
	        }

	        int min = Integer.MAX_VALUE;
	        int max = Integer.MIN_VALUE;
	        for (int num : numbers) {
	            if (num < min) {
	                min = num;
	            }
	            if (num > max) {
	                max = num;
	            }
	        }

	      
	        int expectedLength = max - min + 1;
	        if (expectedLength != numbers.length) {
	            return false; 
	        }

	        boolean[] seen = new boolean[expectedLength];
	        for (int num : numbers) {
	            if (num < min || num > max) {
	                return false; 
	            }
	            if (seen[num - min]) {
	                return false; 
	            }
	            seen[num - min] = true;
	        }

	        return true; 
	    }

	  
	    public static void main(String[] args) {
	        int[] sequence1 = {34, 11, 45, 23, 56};
	        int[] sequence2 = {1, 2, 3, 4, 5}; 
	        int[] sequence3 = {100, 120, 110};   
	        int[] sequence4 = {1, 3, 5, 7};   

	        System.out.println("Sequence 1 is consecutive: " + areConsecutive(sequence1));
	        System.out.println("Sequence 2 is consecutive: " + areConsecutive(sequence2));
	        System.out.println("Sequence 3 is consecutive: " + areConsecutive(sequence3));
	        System.out.println("Sequence 4 is consecutive: " + areConsecutive(sequence4));
	    }
	}


