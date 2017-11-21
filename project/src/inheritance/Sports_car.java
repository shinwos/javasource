package inheritance;

public class Sports_car extends Car{//child
 int airbag = 8;
 
 Sports_car(){
	 this.maxSpeed = 300;
 }
  void run() {
	  System.out.println("스포츠카가 달립니다");
  }
}
