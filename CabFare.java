package com.chainsys.day6;

import java.util.Scanner;

public class CabFare {

	 static void booking() {
	 Scanner sc = new Scanner(System.in);
     //Calculating the cab fare
     System.out.println("ENTER THE CUSTOMER NAME:");
     String name=sc.nextLine();
     System.out.println("ENTER CAB TYPE: Micro ( Rs.10 per km )|Mini ( Rs.15 per km )| Prime (Rs.20 per km):");
     String cabType = sc.next();
     System.out.println("ENTER THE KM: ");
     double distance = sc.nextDouble();
     double farePerKm;
         switch(cabType.toLowerCase()) {
             case "micro":
                farePerKm = 10;
                break;
             case "mini":
                farePerKm = 15;
                break;
             case "prime":
                farePerKm =20;
                break;
             default:
                System.out.println("INVALID! GIVE PROPER CAB TYPE");
                return;
         }
	 
    double totalFare = distance * farePerKm;
    System.out.println("CUSTOMER NAME       :"+name);
    System.out.println("CAB TYPE            :"+cabType);
    System.out.println("KILOMETERS TRAVELLED:"+distance);
    System.out.println("TOTAL FARE          : Rs." + totalFare);
  //Calculating discount
    double discount = 0;
    if(totalFare > 5000) {
        discount = 0.05 * totalFare;
    }else if(totalFare > 2000) {
        discount = 0.02 * totalFare;
    }else {
        discount = 0;
    }
    System.out.println("DISCOUNT APPLIED    : Rs." + discount);
    double discountAmount = totalFare - discount;
    if(totalFare>=5000)
    System.out.println("TOTAL BILL AFTER 5% DISCOUNT IS : Rs." + discountAmount);
    else if(totalFare>=2000)
    {
    	System.out.println("TOTAL BILL AFTER 2% DISCOUNT IS : Rs." +discountAmount);
    }
    else
    {
    System.out.println("TOTAL BILL          : Rs." +totalFare);
    }
  }
}
 

