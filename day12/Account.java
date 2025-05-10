package day12;

public class Account {

	int accNo;//state, feild , instance dm , object level info 
	double balance;
	
	static float intRate;//static dm , class level info
	
	//static block :- it is useful for initializing static dm. 
	static {
		intRate = 4.5f;
	}
	
	//para cons :- it is useful for initializing non-static dm 
	public Account(int accNo , double balance) {
		this.accNo=accNo;
		this.balance=balance;
	}
	
	//instance member method
	public void display() {
		System.out.println("Account no : "+accNo);
		System.out.println("Balance without interest : "+balance);
		double bal = calInterest();
		System.out.println("Balance with intrest "+bal);
	}
	
	public double calInterest() {
		double result = balance * intRate / 100;
		return balance + result;
	}
}
