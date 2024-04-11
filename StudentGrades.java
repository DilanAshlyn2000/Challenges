package com.chainsys.day2;

import java.util.Scanner;

public class StudentGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String name;
			int id,average,englishmark,tamilmark,mathsmark,socialmark,sciencemark,sum;
			Scanner sc=new Scanner(System.in);
			{
			System.out.println("Enter the name of the Student:");
			System.out.println();
			name= sc.nextLine();
			System.out.println("Enter the id of the Student:");
			id=sc.nextInt();
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
			System.out.println("      STUDENT GRADE");
			System.out.println("-----------------------------");
			System.out.println( " NAME         :" +name);
			System.out.println( " ID           :" +id);
			System.out.println( " ENGLISH MARK :" +englishmark);
			System.out.println( " TAMIL MARK   :" +tamilmark);
			System.out.println( " MATHS MARK   :" +mathsmark);
			System.out.println( " SCIENCE MARK :" +sciencemark);
			System.out.println( " SOCIAL MARK  :" +socialmark);
			sum=englishmark+tamilmark+mathsmark+sciencemark+socialmark;
		    average = sum/5;
		    System.out.println(" The average of the marks:" +average);
	        if(average>=95)
	        System.out.println(" The grade is O");
	        else if(average>=90 && average<95)
	        System.out.println(" The grade is A+");
	        else if(average>=85 && average<90)
	        System.out.println(" The grade is A");
	        else if(average>=80 && average<85)
	        System.out.println(" The grade is B+");
	        else if(average>=75 && average<80)
	        System.out.println(" The grade is B");
	        else if(average>=70 && average<75)
	        System.out.println(" The grade is C+");
	        else if(average>=65 && average<70)
	        System.out.println(" The grade is C");
	        else if(average>=60 && average<65)
	        System.out.println(" The grade is D+");
	        else if(average>=55 && average<60)
            System.out.println(" The grade is D");
	        else if(average>=50 && average<55)
	        System.out.println(" The grade is E+");
	        else if(average>=40 && average<50)
	        System.out.println(" The grade is E");
	        else
	        System.out.println("GRADE:FAIL");
	      
	}
	}

}
