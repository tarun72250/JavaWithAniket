package day12;

public class Account2Demo {

	public static void main(String[] args) {
		
		Account2 a1 = new Account2(101,10000.0);
		a1.display();
		
		System.out.println();
		Account2 a2 = new Account2();
		a2.display();//non-static method call , we use object of that class.
		
		System.out.println();
		//I want to call any static method 
		Account2.updateIntRate(5.5f);
		Account2 a3 = new Account2(102,10000.0);
		a3.display();
		
		System.out.println();
		Account2 a4 = new Account2(103,10000.0);
		a4.display();
		
		double r = Math.floor(6.5);
		System.out.println(r);
	}
}
