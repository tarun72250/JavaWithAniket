package day18;

public class A_02_Customer {

	//insatnce dm 
	private String email;
	
	//refrence dm 
	A_02_Address address;//has-a relationship 
	
	//default cons
	public A_02_Customer() {
		
	}
	
	//para cons
	public A_02_Customer(String area ,String city, String pincode , String email ) {
		address = new A_02_Address(area,city,pincode);
		this.email=email;
	}

	//toString() from object class
	@Override
	public String toString() {
		return "A_02_Customer [email=" + email + ", address=" + address.toString() + "]";
	}
	
	public void giveDiscount(double shoppingPrice) {
		System.out.println("Inside the Normal Customer which has no discount");
		address.toString();
		System.out.println("Customer is Normal cutomer without discounted price : "+shoppingPrice);
	}
}
