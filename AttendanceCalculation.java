package com.chainsys.day3;
import java.util.Scanner;
public class AttendanceCalculation {
	public static void main(String[] args) {
		
		int classHeld, classAttended;
        char medicalIssue;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of classes held:");
        classHeld = sc.nextInt();
        if(classHeld>0) 
        {
        System.out.println("Enter the number of classes attended:");
        classAttended = sc.nextInt();
        System.out.println("Do you have medical issues(Y/N)");
        medicalIssue = sc.next().charAt(0);
        int p = (classAttended*100)/classHeld;
        System.out.println("NUMBER OF CLASSES HELD     : "+classHeld);
        System.out.println("NUMBER OF CLASSES ATTENDED : "+classAttended);
        System.out.println("PERCENTAGE                 : " + p);
        if (p >= 75 && medicalIssue == 'Y')
            System.out.println("YOU ARE ALLOWED TO TAKE UP THE EXAM");
        else if (p >= 75 || medicalIssue == 'N')
            System.out.println("YOU ARE ALLOWED TO TAKE UP THE EXAM.");
        else
            System.out.println("YOU ARE NOT ALLOWED TO TAKE UP THE EXAM.");
        }
        else
        System.out.println("INVALID DATA, GIVE CLASS HELD AS POSITIVE NUMBER");
        }}