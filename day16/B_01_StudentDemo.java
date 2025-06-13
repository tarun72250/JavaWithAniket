package day16;

public class B_01_StudentDemo {

	public static void main(String[] args) {
		
		B_01_Student s1 = new B_01_Student();
		s1.display();
		System.out.println(s1.toString());
		
		B_01_Student s2 = new B_01_Student("Siddhant",20,1001,"CS");
		s2.display();
		System.out.println(s2.toString());
		
	}
}
