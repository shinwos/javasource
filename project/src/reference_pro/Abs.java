package reference_pro;

import java.util.Scanner;

public class Abs {
	public class Exercise6_24 {
		 
		  int abs(int value) {
			 if (value <=0) {
				 value = -value;
			 }
			return value;
				
				
			}
		 
		  double abs(double dValue) {
			 if (dValue <=0) {
				 dValue = -dValue;
			 }
			return dValue;
				
				
			}
			
			
			
			public  void main(String[]args) {
				Scanner sc = new Scanner(System.in);
				 double dValue = sc.nextDouble();
				   System.out.println(dValue+"의 절대값:"+abs(dValue));
				}
			
			}
}
