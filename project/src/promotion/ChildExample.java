package promotion;

public class ChildExample {
 public static void main(String[]args) {
	 Child child = new Child();
	 
	 Parents parents = child;
//	 parents.method1();
//	 parents.method2();
	
	 Parents parents2 = new Parents();
	 Friend friend = new Friend();
	 parents.method1(parents);
	 parents2.method1(parents2);
	 parents.method2(parents);
//	 parents2.method2(friend); //�ȵǴ°�
//	 Child badchild = null;
	// if (parents instanceof Child) {
	 //badchild = (Child) parents;//��������ȯ
//	 badchild.method1();
//	 badchild.method2();
//	 System.out.println("parents");}
	 
	 
//	 if (parents2 instanceof Child) {
//	 badchild = (Child) parents2;//��������ȯ
//	 badchild.method1();
//	 badchild.method2();
//	 System.out.println("parents2");}
 }
}
