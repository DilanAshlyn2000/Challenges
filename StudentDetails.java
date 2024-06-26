package com.chainsys.day2;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String id;
int englishmark,tamilmark,mathsmark,sciencemark,socialmark;
String name;
Scanner sc = new Scanner(System.in);
{
	System.out.println("Enter the name of the Student:");
	System.out.println();
	name= sc.nextLine();
	System.out.println("Enter the id of the Student:");
	id=sc.next();
	System.out.println("Enter the English Mark:");
	englishmark=sc.nextInt();
	System.out.println("Enter the Tamil Mark:");
	tamilmark=sc.nextInt();
	System.out.println("Enter the Maths Mark:");
	mathsmark=sc.nextInt();
	System.out.println("Enter the Science Mark:");
	sciencemark=sc.nextInt();
	System.out.println("Enter the Social Mark:");
	socialmark=sc.nextInt();
	System.out.println("      STUDENT DETAILS");
	System.out.println("-----------------------------");
	System.out.println( " NAME         :" +name);
	System.out.println( " ID           :" +id);
	System.out.println( " ENGLISH MARK :" +englishmark);
	System.out.println( " TAMIL MARK   :" +tamilmark);
	System.out.println( " MATHS MARK   :" +mathsmark);
	System.out.println( " SCIENCE MARK :" +sciencemark);
	System.out.println( " SOCIAL MARK  :" +socialmark);
}






	}

}
