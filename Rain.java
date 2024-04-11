package com.chainsys.day3;

import java.util.Scanner;

public class Rain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        char choice;
		        int temperature;
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Is it Raining(Y/N)");
		        choice = sc.next().charAt(0);
		        System.out.println("Enter the temperature");
		        temperature = sc.nextInt();
		        if(temperature>=0 && temperature<=60)
		        {
		        if (choice == 'Y')
		            System.out.println("Bring umbrella");
		        if (temperature < 32)
		            System.out.println("Bring heavy jacket");
		        else if (temperature >= 32 && temperature <= 50)
		            System.out.println("Bring light jacket");
		        else
		            System.out.println("No need for jacket");
		    }
		        else
		            System.out.println("INVALID DATA");
		   

        }
    }