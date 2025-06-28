package day18;

public class A_06_Book {

	//insatnce dm
	private String title;
 	private String author;
 	private double cost;
 	
 	//default cons
 	public A_06_Book() {
 		
 	}
 	
 	//para cons
 	public A_06_Book(String title , String author, double cost) {
 		this.title=title;
 		this.author=author;
 		this.cost=cost;
 	}
 	
 	public double calculateCost() {
 		return this.cost;
 	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}
 	
 	//getter 
 	
}
