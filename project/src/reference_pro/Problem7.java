package reference_pro;

public class Problem7 {
 public static void main(String[] args) {
	 int max=0;
	 int[]array= {1,5,3,8,2};
	 int temp = array[0];
	 
	 for(int i=0; i<array.length;i++) {
		 if(array[i]>temp) {
			 temp = array[i];
		 }
			 
	 }
	 max=temp;
	 
	 System.out.println("max:" +max);
 }
}
