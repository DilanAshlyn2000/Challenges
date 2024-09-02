package com.chainsys.day7;

import java.util.Scanner;

public class AverageCalculator {

    public double calculateAverage(int[] nums) {
        if (nums.length == 0) return 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i]; 
            sum += num; 
        }
        return (double) sum / nums.length;
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
        AverageCalculator ac = new AverageCalculator();
        double result = ac.calculateAverage(nums);
        System.out.println("Average: " + result);
    }
}
