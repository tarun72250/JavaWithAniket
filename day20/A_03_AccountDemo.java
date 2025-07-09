package day20;

import java.util.Scanner;

public class A_03_AccountDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		A_03_Account [] accounts;
		accounts = new A_03_Account[5];
		
		for(int i=0 ; i<accounts.length ; i++)
		{
			System.out.println("\n---- Enter details of Account ---"+(i+1)+"------");
			System.out.println("Choose Account type :");
			System.out.println("1. Savings Account");
            System.out.println("2. Current Account");
            System.out.println("3. Recurring Account");
            int choice = sc.nextInt();
            
            // Common details
            System.out.print("Enter Account ID: ");
            int accountId = sc.nextInt();
            sc.nextLine(); // consume leftover newline
            System.out.print("Enter Account Holder Name: ");
            String accountHolderName = sc.nextLine();
            System.out.print("Enter Initial Balance: ");
            double initialBalance = sc.nextDouble();

            A_03_Account a = null ;
            switch(choice) {
            case 1:
            	a = new A_03_SavingAccount(accountId,accountHolderName,initialBalance);
            	break;
            case 2:
            	System.out.print("Enter Overdraft Limit: ");
                double overdraftLimit = sc.nextDouble();
                a= new A_03_CurrentAccount(accountId, accountHolderName, initialBalance, overdraftLimit);
            	break;
            case 3:
            	System.out.print("Enter Installment Amount or Recurring amount: ");
                double installmentAmount = sc.nextDouble();
                System.out.print("Enter Number of Installments: ");
                int numInstallments = sc.nextInt();
                a = new A_03_RecurringAccount(accountId, accountHolderName, initialBalance, numInstallments, installmentAmount);
            	break;
            default:
                System.out.println("Invalid account type selected. Skipping this account.");
                i--; // reattempt this index
                continue;
            }
            
            // Perform withdrawal
            System.out.print("Enter amount to withdraw: ");
            double withdrawAmount = sc.nextDouble();
            a.withDraw(withdrawAmount);
         
            // Store object in array
            accounts[i] = a;
		}
		
		
		System.out.println("\n displaying the account details--------");
		for(A_03_Account a :accounts) {
			a.display();
			System.out.println("-------------------------");
		}
		
		sc.close();
	}
}
