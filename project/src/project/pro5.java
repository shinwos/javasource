package project;

public class pro5 {
 public static void main(String[]args) {
	 int number=12321;
	 int tmp = number;
	 int result =0;
	 int value =0;
	 while(tmp !=0) {
		 value=tmp%10;
		 System.out.println(value);
		 tmp/=10;
		 result=((result*10)+value);
		 }System.out.println(result);
	 
	 
	 if (number==result)
		 System.out.println(number +"는 회문수 입니다");
	 else System.out.println(number +"는 회문수가 아닙니다");
 }
}
