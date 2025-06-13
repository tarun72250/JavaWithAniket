package day16;

public class B_02_Customer {

	private String emailId;
	private String address;
	
	//default cons
	public B_02_Customer() {
		
	}
	
	//para cons
	public B_02_Customer(String emailId , String address) {
			this.emailId = emailId;
			this.address = address;
	}
	
	public void giveDiscount(double shoppingPrice) {
		//Normal customer gives no dicount
		
		System.out.println("Email id : "+emailId);
		System.out.println("Address : "+address);
		System.out.println("FinalPrice : "+shoppingPrice);
	}
	
	//getter 
	public String getEmailId() {
		return this.emailId;
	}
	
	public String getAddress() {
		return this.address;
	}
	
}
