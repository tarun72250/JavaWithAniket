package day18;

public class A_01_Demo {

	public static void main(String[] args) {
		
//		Polymorphic variable 
		Object o ;
		o = new A_01_Person();
		o = new A_01_Date();
	
		//static binding
		A_01_Date d = new A_01_Date(11,01,2025);
		System.out.println(d);//d.toString()
		
		
		System.out.println("\n---------------------------");
		//Dynamic Binding or Generic refrence 
		//super class reference and sub class object = generic refrence
		A_01_Person p = new A_01_Emp();
		System.out.println(p);
		
		
		
		
	}
}
