package class_example1;

public class Car {
//field
	String model;
	int speed;
	
//method
	
	void setspeed(int speed) {
		this.speed=speed;
	}
	void run() {
		for(int i=10;i<=50;i+=10) {
			this.setspeed(i);
			System.out.println(this.model +"�� �޸��ϴ�.(�ü�:"+ this.speed+"km/h");
		}
	}
//constructor
	Car(String model){
		this.model= model;
	}
}
