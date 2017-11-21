package promotion;

import java.lang.reflect.Array;

public class Exercise6_23 {
//     static int max=0;
//     static int []arr;
//	static int max(int[]arr) {
//	 for(int i=0; i<arr.length; i++) {
//		 if(arr[i]>max) {
//			 max=arr[i];
//	 }else if(arr.length==0||arr=null){return -9999999;}
//	 }return max;
// }
	
//	public static int[] maxArray(int[] arr) {
//	      int maxTemp = arr[0];
//	      int j = 0;
	      
//	      for(int i = 0; i < arr.length; i++) {
//	         if(arr[i] > maxTemp) {
//	            maxTemp = arr[i];
//	            j = i;
//	         }
//	      }
//	      if((0 < j) && (j < arr.length)) {
//	         arr[j] = arr[0];
//	         arr[0] = maxTemp;
//	      }
//	      return arr;
//	   }

		
	public static int min(int[] arr) {
		int min=0;
		int temp = arr[0];
	 for(int i=0; i<arr.length; i++) {
		 if(arr[i]<temp) {
			 temp = arr[i];
		 }
	 }
		
		
		min = temp;
		return min;
	}
	
	
	
	public static void main(String[]args) {
		int [] data = {3,2,9,4,-5};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최소값:"+min(data));
//		System.out.println("최대값:"+max(null));
//		System.out.println("최대값:"+max(new int[] {}));
	}
}
