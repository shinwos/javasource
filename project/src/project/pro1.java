package project;

public class pro1 {
 public static void main(String[]args) {
	 int fah =100;
	 float celcius = (float)(((int)((5.0/9.0 * (fah-32.0))*100+0.5))/100.0);
	 
	 System.out.println("Fahrenheit:" + fah);
	 System.out.println("Celcius:" +celcius);
 }
}
