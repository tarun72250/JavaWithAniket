package day20;

public abstract class A_03_Account {

	//instance dm
	private int accNo;
	private String accountName;
	protected double balance;
	
	//default cons
	public A_03_Account() {
		
	}
	
	//para cons
	public A_03_Account(int accNo , String accountName, double balance) {
		this.accNo=accNo;
		this.accountName=accountName;
		this.balance=balance;
	}
	
	//abstract method
	public abstract void withDraw(double amount);
	
	
	//abstract method 
	public abstract void calculateBalance();
	
	
	//concrete method
	public void display() {
		System.out.println("Account number : "+accNo+" Account Holder Name : "+accountName+" Account balance : "+balance);
	}
	
	//getter methods
//	public double getBalance() {
//		return balance;
//	}
}
