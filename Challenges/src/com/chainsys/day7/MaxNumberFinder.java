package com.chainsys.day7;

import java.util.Scanner;

public class MaxNumberFinder {

    public int findMax(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        MaxNumberFinder mnf = new MaxNumberFinder();
        int result = mnf.findMax(nums);
        System.out.println("Maximum number: " + result);
        
    }
}
