package promotion;

public class Parents {
 public void method1(Parents parents) {
	 if(parents instanceof Parents) {
		 System.out.println("Child-method1");
	 }else {
		 System.out.println("Parents-method1");
	 }
 }
 public void method2(Parents parents) {
	 if(parents instanceof Parents) {
		 System.out.println("Parents-method1");
	 }else {
		 System.out.println("Child-method1");
	 }
 }
 
}
