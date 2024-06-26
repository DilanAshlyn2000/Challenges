package com.chainsys.day4;

import java.util.Scanner;
import java.util.regex.*;
public class EmailValidation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter your Email: ");
	      String mail = sc.next();
	      String regex = "^[a-z0-9+_.-]+@[a-z0-9.-]+$";
	      boolean result = mail.matches(regex);
	      if(result) {
	      System.out.println("Enter your password:");
	      String password = sc.next();
          String regExpn = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$";

          Pattern patterns = Pattern.compile(regExpn, Pattern.CASE_INSENSITIVE);
          Matcher matchers = patterns.matcher(password);
          boolean valid = matchers.matches();  
          
          if(valid) 
          System.out.println("DONE");
          else
                  System.out.println(" Your password is invalid, password should consist of characters,digits and special characters.");
              }else {
                  System.out.println("Your email-id is invalid, it should consist of lowercase and digits.");
              }
	}

}
