package day16;

import java.util.Scanner;

public class B_02_RegCustomerDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter type of address (1-RCus , 2-Cus)");
		int type = sc.nextInt();
		
		System.out.println("Enter email :");
		String email = sc.next();
		System.out.println("Enter address :");
		String address = sc.next();
		
		
		if(type == 1)
		{
			System.out.println("Enter Regno :");
			int regno= sc.nextInt();
			
			System.out.println("Enter Shopping Price :");
			double sprice= sc.nextDouble();
			
			B_02_RegCustomer rc = new B_02_RegCustomer(email,address,regno);
			rc.giveDiscount(sprice);
			
		}
		else if(type ==2)
		{
			
			System.out.println("Enter Shopping Price :");
			double sprice= sc.nextDouble();
			
			B_02_Customer c = new B_02_Customer(email,address);
			c.giveDiscount(sprice);
		}
		else
		{
			System.out.println("Invalid type");
		}

		
	}
}
