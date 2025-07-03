package day20;

import java.util.Scanner;

public class A_02_BookDemo {
	public static void main(String[] args) {
		
		//take input from user
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many books info u maintained");
		int n = sc.nextInt();//5
		sc.nextLine(); // Consume the newline character
    		   
		A_02_Book[] books;
		books = new A_02_Book[n];//5
		
        for (int i = 0; i < books.length; i++) 
        {    
            System.out.print("Enter title of the book: ");
            String title = sc.nextLine();
            System.out.print("Enter author of the book: ");
            String author = sc.nextLine();
            System.out.print("Enter cost of the book: ");
            double cost = Double.parseDouble(sc.nextLine());

        	System.out.print(i+" Enter type of book (EBook/PaperBook): ");
            String bookType = sc.nextLine().toLowerCase();
            
            if (bookType.equals("ebook")) {
                books[i] = new A_02_Ebook(title, author, cost);
            } 
            else if (bookType.equals("paperbook")) {
                books[i] = new A_02_PaperBook(title, author, cost);
            }
            else 
            {
                System.out.println("Invalid book type. Please enter either 'EBook' or 'PaperBook'.");
                i--; // Decrement i to repeat the loop iteration
            }
        }

        //Advanced for loop
//        for(Type t :arrObj) {
//        	
//        }
        
        for (A_02_Book b : books) {
            System.out.println("Title: " + b.getTitle() + ", Author: " + b.getAuthor() + ", Final Cost: " + b.calculateCost());
        }
	}
}
