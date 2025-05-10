package day12;

public class Account2 {

	int accNo;//state, feild , instance dm , object level info 
	double balance;
	
	static float intRate;//static dm , class level info
	
	//static block :- it is useful for initializing static dm. 
	static {
//		this.intRate = 4.5f;//because this(instance dm) can't acces inside any static block.
		intRate = 4.5f;
	}
	
	//static method :- it is useful for updating static variable
	public static void updateIntRate(float newRate) {
		//we can't acces this insdie static method .
		intRate = newRate;
	}
	
	//default cons
	public Account2()
	{	
//		this.accNo =0;
//		this.balance=0.0;
	}
	
	//para cons :- it is useful for initializing non-static dm 
	public Account2(int accNo , double balance , int rate) {
		this.accNo=accNo;
		this.balance=balance;
		//intRate = rate; // it is not a write a way to update any static dm.
		//this.intRate = rate;//The static field Account2.intRate should be accessed in a static way
	}
	
	public Account2(int accNo , double balance) {
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
