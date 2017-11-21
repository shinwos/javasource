package project;

public class pro2 {
 public static void main(String[]args) {

	 int sum =1;
	 int totalsum=3;
	 for(int i=1; i<=27;i*=3) {
		 sum=sum+i;
		 totalsum=totalsum+sum;

		 System.out.println(totalsum);
	 }
 }
}
