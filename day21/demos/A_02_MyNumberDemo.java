package day21.demos;
//Menu driven program
import java.util.Scanner;
import day21.entity.A_02_MyNumber;

public class A_02_MyNumberDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		A_02_MyNumber m = new A_02_MyNumber();
		
		int choice;
		
		do {
			System.out.println("Choose a method to call ...!");
			System.out.println("1. Check if an number is Odd");
			System.out.println("2. Check if an number is Even");
			System.out.println("3. Check if an number is Prime");
			System.out.println("4. Calculate Factorial ");
			System.out.println("5. Exit");
			
			System.out.println("Enter the choice (1-5):");
			choice = sc.nextInt();
			
			if(choice == 5) {
				break;
			}
			
			System.out.println("Enter the number ...!");
			int num = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				boolean result = m.isOdd(num);
				System.out.println(num+" is Odd? "+result+"\n---------------------\n");
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				double result4 = m.isFactorial(num);
				System.out.println("Factorial of :"+num +" is :"+result4);
				break;
			default: 
				System.out.println("Invalid choice , Please choice the correct option...");
			}
			
			
		}while( choice != 5);
		System.out.println("Exiting program.");
	    sc.close();
		
	}
}
