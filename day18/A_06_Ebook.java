package day18;

public class A_06_Ebook extends A_06_Book{

	//default cons
	 public A_06_Ebook() {
	 }
	 
	 //para cons
	 public A_06_Ebook(String title, String author, double cost) {
	        super(title, author, cost);
	 }

	@Override
	public double calculateCost() {
		double originalCost = super.calculateCost();
		 if (originalCost <= 500) 
	        {
	            return originalCost  * 0.02;
	        }
	        else if (originalCost > 500 && originalCost <= 1000) 
	        {
	            return originalCost * 0.95;
	        } 
	        else if (originalCost > 1000 && originalCost <= 5000)
	        {
	            return originalCost * 0.93;
	        } 
	        else 
	        {
	            return originalCost;
	        }
	}
	 
	 
}
