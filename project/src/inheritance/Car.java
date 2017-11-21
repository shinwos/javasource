package inheritance;

public class Car extends Macha{//parent
 String company ="BMW";
 int maxSpeed =200;
 int tire =4;
 int horse =0;
 
 Car(){
	 System.out.println("car()");
 }
 
 Car(String name){
	 System.out.println("car()"+name);
 }
 
 void run() {
	 System.out.println("자동차가 달립니다.");
 }
}
