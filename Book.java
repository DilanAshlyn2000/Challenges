package com.chainsys.day2;

import java.util.Scanner;

public class Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String author,language,subject,title;
		int publishedyear;
		float rating;
		Scanner sc = new Scanner(System.in);
		{
			System.out.println("Enter the title of the Book:");
			title= sc.nextLine();
			System.out.println("Enter the Author of the Book:");
			author=sc.nextLine();
			System.out.println("Enter the Year of Publication:");
			publishedyear=sc.nextInt();
			System.out.println("Enter the Language of the Book:");
			language=sc.next();
			System.out.println("Enter the Subject of the Book:");
			subject=sc.next();
			System.out.println("Enter your 1 - 5 feedback rating:");
			rating=sc.nextFloat();
			System.out.println("         BOOK REVIEW");
			System.out.println("-----------------------------");
			System.out.println( " BOOK TITLE     :" +title);
			System.out.println( " AUTHOR         :" +author);
			System.out.println( " PUBLISHED YEAR :" +publishedyear);
			System.out.println( " LANGUAGE       :" +language);
			System.out.println( " SUBJECT        :" +subject);
			System.out.println( " RATING         :" +rating);
		}

	}

}
