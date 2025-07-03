package day20;

public class A_02_PaperBook extends A_02_Book{

	//default cons
	public A_02_PaperBook() {
		
	}
	
	//para cons
	public A_02_PaperBook(String title , String author, double cost) {
		super(title ,author,cost);
	}
	
	@Override
	public double calculateCost() {
		double originalCost = super.getCost();
		if(originalCost <= 500) {
			return originalCost * 0.02;
		}
		else if(originalCost > 500 &&  originalCost <= 1000) {
			return originalCost * 1.05;
		}
		else if(originalCost > 1000 && originalCost <= 5000) {
			return originalCost * 1.02;
		}
		else {
			return originalCost;
		}
	}
}
