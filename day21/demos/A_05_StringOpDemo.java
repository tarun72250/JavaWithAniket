package day21.demos;

import java.util.Scanner;

import day21.entity.A_05_StringImpl;
import day21.utils.A_05_StringOperations;

public class A_05_StringOpDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		A_05_StringOperations stOps = new A_05_StringImpl();
		boolean exit = false;
		
		while(!exit) {
			System.out.println("\nSelect an operation:");
            System.out.println("1. Reverse String");
            System.out.println("2. Convert to Uppercase");
            System.out.println("3. Get Length of String");
            System.out.println("4. Check if Palindrome");
            System.out.println("5. Append Strings");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			
			switch(choice) {
			case 1:
				System.out.println("Enter the String to reverse: ");
				String str = sc.next();
				stOps.reverse(str);
				break;
			case 2:
				System.out.println("Enter String to Uppercase :");
				String str1 = sc.nextLine();
				stOps.toUppercase(str1);
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				exit = true;
				break;
			default:
					System.out.println("Invalid choice , Please try again...!");
			
			}
		}
		
		System.out.println("Exiting program.");
	    sc.close();
	}
}
