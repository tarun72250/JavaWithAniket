package day20;

public class A_03_SavingAccount extends A_03_Account{

	//static dm
	private static double intRate;
	
	//static block 
	static {
		intRate = 0.05;
	}
	
	//default cons
	public A_03_SavingAccount() {
		
	}
	
	//para cons
	public A_03_SavingAccount(int accNo , String accountName, double balance) {
		super(accNo, accountName, balance);
	}
	
	
	
	@Override
	public void withDraw(double amount) {
		//in SavingAccount keep 2000 as min balance then withdrawal
		if(balance >= amount) {
			//balance = balance - amount;
			balance -= amount;
			System.out.println("Withdrawal of "+amount+" from Svaing account succesful.");
		}
		else {
			System.out.println("Insufficient balance in saving account");
		}
	}

	@Override
	public void calculateBalance() {
		double intrest = balance * intRate;
		balance = balance + intrest;
		System.out.println("Intrest of "+intrest+" added");
	}
	
	
	public void display() {
		super.display();
	}

	
}
