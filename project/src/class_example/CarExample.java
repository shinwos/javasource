package class_example;

public class CarExample {
 public static void main(String[]args) {
	 Car myCar = new Car(5000,"Æ÷¸£½¦",300);
	 Car yourCar = new Car(4000);
	 
	 myCar.run();
	 System.out.println(myCar.company);
	 System.out.println(yourCar.company);
	 
	 Car.company = "vv";
	 System.out.println(myCar.company);
	 System.out.println(yourCar.company);
	 
	 myCar.company = "º¥Ã÷";
	 System.out.println(myCar.company);
	 System.out.println(yourCar.company);
	 
 }
}
