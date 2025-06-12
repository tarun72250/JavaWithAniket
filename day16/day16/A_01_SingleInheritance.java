package day16;

class A{
	public void display() {
		System.out.println("inside the method A");
	}
}

class B extends A{
//	public void display() {
//		System.out.println("Inside the method B");
//	}
}

public class A_01_SingleInheritance{
	public static void main(String[] args) {
		
		B b = new B();
		b.display();
	}
}
