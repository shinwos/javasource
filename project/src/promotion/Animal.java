package promotion;

public abstract class Animal {//�߻� Ŭ����
 //field
	public String kind;
 
	
	// constuctor
 Animal(){
	 System.out.println("Animal()");
 }
 
 //method
  void breathe() {//�Ϲ� �޼���
	  System.out.println("Wild Breathe()");
  }
  public abstract void sound(); //�߻�޼���
}

