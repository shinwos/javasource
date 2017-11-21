package project;

public class homework3 {
 public static void main(String[]args) {
	 int sum =0;
	 int sumsum =0;
	 for (int i=1; i <=10; i++) {
		 sum +=i;
		 sumsum +=sum;
	 }
	 System.out.println("sumsum=" + sumsum);
 }
}
