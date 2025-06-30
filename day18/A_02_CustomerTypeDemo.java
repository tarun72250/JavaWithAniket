package day18;

public class A_02_CustomerTypeDemo {

	public static void main(String[] args) {
		
		A_02_Customer c = new A_02_Customer("Krishna Nagar","Indore","462001","Aniket123@gmail.com");
		System.out.println(c);
		c.giveDiscount(3000.0);
		
		System.out.println("\n");
		A_02_RegCustomer r = new A_02_RegCustomer("Prem Nagar","Indore","462001","Ram123@gmail.com",1001);
		System.out.println(r);
		r.giveDiscount(4000);
		
		
		//Todo : Aniket - complete console based system
		
	}
}
