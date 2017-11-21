package project;

public class referenceValue {
 public static void main(String[]args) {
	 char a= 'a';
	 
	 boolean tf = false;
	 String name = "º∫¿Á»∆";
	 String name2 = "º∫¿Á»∆";
	 String name3 = new String("º∫¿Á»∆");
	 
	 tf = (name.equals(name3));
	 
	
	 System.out.println(name);
	 System.out.println(tf);
 }
}
