package problem;

import java.util.Scanner;

public class Exercise6_24 {
 
 static int abs(int value) {
	 if (value <=0) {
		 value = -value;
	 }
	return value;
		
		
	}
 
 static double abs(double dValue) {
	 if (dValue <=0) {
		 dValue = -dValue;
	 }
	return dValue;
		
		
	}
	
	
	
	public static void main(String[]args) {
		
//		int value =5;
//		System.out.println(value+"�� ���밪:"+abs(value));
//		value = -10;
//		System.out.println(value+"�� ���밪:"+abs(value));		
//		double dValue = -20.5;
//		System.out.println(value+"�� ���밪:"+abs(dValue));
		
	   Scanner sc = new Scanner(System.in);
//	     int value = sc.nextInt();
//	     
//	   System.out.println(value+"�� ���밪:"+abs(value));
	   
	   double dValue = sc.nextDouble();
	   System.out.println(dValue+"�� ���밪:"+abs(dValue));
	}
}
