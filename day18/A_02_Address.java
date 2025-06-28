package day18;

public class A_02_Address {

	//instance dm 
	private String area,city,pincode;
	
	//default cons 
	public A_02_Address() {
		
	}
	
	//para cons 
	public A_02_Address(String area , String city , String pincode) {
		this.area=area;
		this.city=city;
		this.pincode=pincode;
	}

	//toString() from Object class
	@Override
	public String toString() {
		return "A_02_Address [area=" + area + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	
}
