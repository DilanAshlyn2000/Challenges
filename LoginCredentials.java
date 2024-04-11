package com.chainsys.day3;

import java.util.Scanner;

public class LoginCredentials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Username = "dilan_ashlyn";
        String Password = "Dilan03";
        Scanner sc = new Scanner(System.in);
        {
        System.out.print("Enter your username: ");
        String username = sc.nextLine();
        System.out.print("Enter your password: ");
        String password = sc.nextLine();
        if (username.equals(Username) && password.equals(Password)) {
            System.out.println("WELCOME");
        } else {
            System.out.println("Incorrect Username/Password.Please try again.");
        }

        sc.close();
	}
	}
}
