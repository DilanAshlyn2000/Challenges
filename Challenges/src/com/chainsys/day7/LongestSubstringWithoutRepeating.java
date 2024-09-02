package com.chainsys.day7;
import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstringWithoutRepeating {

    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, right = 0, maxLength = 0;

        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right++));
                maxLength = Math.max(maxLength, set.size());
            } else {
                set.remove(s.charAt(left++));
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeating lsr = new LongestSubstringWithoutRepeating();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int result = lsr.lengthOfLongestSubstring(input);
        System.out.println("Longest substring without repeating characters is of length: " + result);

        scanner.close(); 
    }
}
