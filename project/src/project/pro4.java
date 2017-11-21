package project;

public class pro4 {
 public static void main(String[]args) {
	 int num1 =1;
	 int num2 =1;
	 int num3= 0;
	 int sum =0;
	 
	 sum=num1+num2;
	 for(int i=0; i<8;i++) {
		 num3=num1+num2;
		 sum=sum+num3;
	     num1=num2;
	     num2=num3;
	 
		 
	 }System.out.println("피보나치의 합은"+sum);
	 
 }
}
