package day16;

public class B_01_EmpDemo {

	public static void main(String[] args) {
		
		//Creating a Person object
		B_01_Person p1 = new B_01_Person();//dafault cons calling
//		p1.display();
//		System.out.println(p1.toString());
		
		B_01_Person p2 = new B_01_Person("Aniket",24);//para cons
//		p2.display();
//		System.out.println(p2.toString());
		
		 // Creating an Emp (Employee) object
		B_01_Employee e1 = new B_01_Employee();//default cons calling
//		e1.display();
//		System.out.println(e1.toString());
		
		B_01_Employee e2 = new B_01_Employee("Aniket",24,1001,50000);//para cons calling
//		e2.display();
//		System.out.println(e2.toString());
		
		//super class refrence but sub class object creation that is called as Dynamic Binding.
		B_01_Person p3 ;//p3 refrence decleration
//		p3 = new B_01_Employee();//object creation
//		p3.display();//whose display method is call = employee class display() is call.
		
		//but vice versa is not possible , means sub class refrence not created object of parent class.
		//B_01_Employee e1 = new B_01_Person();//generate error 
		
		
	}
}
