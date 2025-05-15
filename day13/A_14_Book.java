package day13;

public class A_14_Book {

	  
	    private int bookId;
	    private float price;
	    private int qty;//instance variable , instance level scope
	    private A_14_Author author;//refrence variable  
	    private static int bkNo ;//static varizble , class level scope
	    
	 // Static block to initialize bkNo
	    static {
	        bkNo = 1000;
	    }

	    // Default constructor
	    public A_14_Book() {
	    	author = new A_14_Author();
	        this.bookId = bkNo++;
	    }

		public A_14_Book( float price, int qty, String name, String email, long mobileNo) {
			super();
			this.price = price;
			this.qty = qty;
			this.author = new A_14_Author(name,email,mobileNo);
			this.bookId = bkNo++;
		}   
		
		public void display() {
			System.out.println("Book id : "+bookId);
			System.out.println("Price : "+price);
			System.out.println("Quantity : "+qty);
		    author.display();
		}
}
