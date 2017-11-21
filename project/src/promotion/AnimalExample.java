package promotion;

public class AnimalExample {
 public static void main(String[] args) {
	 //#1
	 Dog dog = new Dog();
	 Cat cat = new Cat();
	 
	 dog.sound();	 
	 System.out.println(dog.kind);
	 cat.sound();
	 System.out.println(cat.kind);
	 //#2
	 
	 Animal animal = null;
	 animal = new Dog();
	 animal.sound();
	 System.out.println(animal.kind);
	 
	 animal = new Cat();
	 animal.sound();
	 System.out.println(animal.kind);
	 
//	 Animal animal2 = new Animal();
	 
	 
 }
 
}
