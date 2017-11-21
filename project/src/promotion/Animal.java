package promotion;

public abstract class Animal {//추상 클래스
 //field
	public String kind;
 
	
	// constuctor
 Animal(){
	 System.out.println("Animal()");
 }
 
 //method
  void breathe() {//일반 메서드
	  System.out.println("Wild Breathe()");
  }
  public abstract void sound(); //추상메서드
}

