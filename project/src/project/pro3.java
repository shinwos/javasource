package project;

public class pro3 {
 public static void main(String[]args) {
	 int num = 12345678;
	 int sum =0;
	 
	 while(num>0) {
		 sum = sum +(num%10);
		 num = num/100;
		 
	 }System.out.println("sum="+ sum);
 }
}
