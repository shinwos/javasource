package class_example;

public class Car {
	//field
	    static String company ="BMW";
		static final double PI =3.14521;
	    String model;
		int maxspeed;
		int cc;
		int speed;
		
	//method
		
		 void setspeed(int speed) {
			this.speed=speed;
		}
		void run() {
			for(int i=10;i<=50;i+=10) {
				this.setspeed(i);
				System.out.println(this.model +"�� �޸��ϴ�.(�ü�:"+ this.speed+"km/h)");
			}
		}
	//constructor
		Car(String model){
			this(5000,model);
		    
		}	
		Car(int cc){
			this(cc,"������");
		
		}
		Car(int cc, String model){
			this.cc=cc;
			this.model =model;
			System.out.println("Car(int cc, String model ȣ��");
		}
		Car(int cc, String model,int maxspeed){
			this(cc,model);
			this.maxspeed =maxspeed;
		}
	}

