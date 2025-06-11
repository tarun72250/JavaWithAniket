package day16;

class P{
	public void m1() {
		System.out.println("Parent Class");
	}
}

class C extends P{
	//m1();
	public void m2() {
		System.out.println("Child Class");
	}
}


public class A_03_TestDemo {

	public static void main(String[] args) {
		
		//Case 1: On the parent refrence . child specefic methods or variable can't access/ call.
		P p = new P();
		p.m1();//correct
		//p.m2();//error 
		
		//case 2: On the Child refrence , parent specific methods or variable can be call easily.
		C c = new C();
		c.m1();
		c.m2();
		
		//case 3: Parent refrence i am Creating, Object creating using child refrence
		P p1 ;//refrence variable
		p1 = new C();//object C
		p.m1();//correct 
		//p1.m2();//error
		//It create base for polymorphism
		
		//case 4:
		//C c1 = new P();//incompatible error 
	}
}
