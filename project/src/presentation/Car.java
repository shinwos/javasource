package presentation;

public class Car {
 String company = "BMW";
 String model = "M";
 String color = "Blue";
 int maxspeed = 300;
 int currspeed = 0;
 
 int add(int a, int b) {
	 int result;
	 result = a+b;
	 return result;
 }
 
 int add(double a, double b) {
	 double result;
	 result = a+b;
	 return (int)result;}
	 
	 int add(double a, double b, int c) {
		 int result;
		 result = add(a,b)+c;
		 return (int)result;
 }
 
Car(){
	
}
	 
	 
 Car(String _color,int _maxspeed) {
	color = _color;
	 maxspeed = _maxspeed;
 }
}
