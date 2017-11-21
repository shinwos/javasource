package promotion;

class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

public class PromotionExample {
  B b= new B();
  C c= new C();
  D d= new D();
  E e= new E();
  
  A a= new A();
  
  A ab = new B();
  A ac = new C();
  A ad = new D();
  A ae = new E();
   //상속한 자식 객체만 자동 형변환이 가능하다
/*  
  C cd = new D();
  B be = new E();
  D da = new A();
  */
  
  
  
}
