package problem;

public class Exercise6_22 {
  public static boolean isNumber(String str){
	  boolean result = false;
	  for(int i=0; i<str.length(); i++) {
		  if((str.charAt(i)>=48)&&(str.charAt(i)<=57)) {
			  result = true;
		  }else {
			  result = false;
			  break;
		  }
	  }
  return result;
  }
	public static void main(String[]args) {
		String str = "123";
		System.out.println(str+"는 숫자입니까?"+isNumber(str));
		
		str = "12o34";
		System.out.println(str+"는 숫자입니까?"+isNumber(str));
	}
	
}
