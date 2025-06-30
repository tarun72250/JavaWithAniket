package day18;

public class A_02_RegCustomer extends A_02_Customer {

	//instance dm
	private int regNo;
	
	//default cons
	public A_02_RegCustomer() {
		super();
	}
	
	//para cons
	public A_02_RegCustomer(String area ,String city, String pincode , String email, int regNo) {
		super(area, city, pincode, email);
		this.regNo=regNo;
	}

	@Override
	public String toString() {
		return "A_02_RegCustomer [regNo=" + regNo + ", address=" + address.toString() + "]";
	}
	
	//instance member method
	public void giveDiscount(double shoppingPrice) {
		System.out.println("Customer is Regular customer gives 5% dicount");
		System.out.println("Registeation No : "+regNo);
		double discount = shoppingPrice * 0.05;
		double finalPrice = shoppingPrice - discount;
		System.out.println("Customer is Regular cutomer 5% discounted price is : "+finalPrice);
	}
	
}
