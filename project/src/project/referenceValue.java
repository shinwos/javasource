package project;

public class referenceValue {
 public static void main(String[]args) {
	 char a= 'a';
	 
	 boolean tf = false;
	 String name = "������";
	 String name2 = "������";
	 String name3 = new String("������");
	 
	 tf = (name.equals(name3));
	 
	
	 System.out.println(name);
	 System.out.println(tf);
 }
}
