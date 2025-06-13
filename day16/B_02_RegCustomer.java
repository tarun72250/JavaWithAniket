package day16;

public class B_02_RegCustomer extends B_02_Customer {

	int regNo;
	
	//default cons 
	public B_02_RegCustomer() {
		
	}
	
	//para cons 
	public B_02_RegCustomer(String emailId , String address, int regNo) {
		super(emailId, address);
		this.regNo = regNo;
	}
	
	public void giveDiscount(double shoppingPrice) {
		//Regular customer gives 5% discount
		double discount =  shoppingPrice * 0.5/10;
		double finalPrice = shoppingPrice - discount;
		System.out.println("Email id : "+ super.getEmailId());
		System.out.println("Address : "+super.getAddress());
        System.out.println("Final price for regular customer (with 5% discount): $" + finalPrice);
	}
	
	
}
