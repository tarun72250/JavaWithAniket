package day20;

public class A_03_RecurringAccount extends A_03_Account {

	//instance dm
	private double recurringAmount;
	private int noOfInstallment;
	//static dm
	private static double intRate;
	
	static {
		intRate = 0.06;
	}

	//default cons
	public A_03_RecurringAccount() {
		
	}
	
	//para cons
	public A_03_RecurringAccount(int accNo , String accountName, double balance , int noOfInstallment , double recurringAmount) {
		super(accNo,accountName,balance);
		this.recurringAmount=recurringAmount;
		this.noOfInstallment=noOfInstallment;
	}
	
	@Override
	public void withDraw(double amount) {
		//withdrawal is not allowed
		System.out.println("Withdrawal is not Allowed for Recurring account");
	}
	
	@Override
	public void calculateBalance() {
	 double maturityAmount = recurringAmount * noOfInstallment;
	 double intrest = maturityAmount * intRate;
	 balance = maturityAmount + intrest;
	 System.out.println("Maturity + Interest = ₹" + balance);
	}
	
	
	public void display() {
		super.display();
		 System.out.println("Recurring Amount: ₹" + recurringAmount);
	     System.out.println("Installments: " + noOfInstallment);
	}

	
	
}
