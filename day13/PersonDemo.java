package day13;

public class PersonDemo {

	public static void main(String[] args) {
		
		Person p1;
		p1 = new Person("Aniket",11,12,2025);
		p1.display();
		
		
		System.out.println();
		Person p2;
		p2 = new Person();//default cons calling
		p2.display();
		
	}
}


