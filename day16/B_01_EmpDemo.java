package day16;

public class B_01_EmpDemo {

	public static void main(String[] args) {
		
		//Creating a Person object
		B_01_Person p1 = new B_01_Person();
//		p1.display();
//		System.out.println(p1.toString());
		
		B_01_Person p2 = new B_01_Person("Aniket",24);
//		p2.display();
//		System.out.println(p2.toString());
		
		 // Creating an Emp (Employee) object
		B_01_Employee e1 = new B_01_Employee();//default cons calling
//		e1.display();
//		System.out.println(e1.toString());
		
		B_01_Employee e2 = new B_01_Employee("Aniket",24,1001,50000);//para cons calling
		e2.display();
		System.out.println(e2.toString());
	}
}
