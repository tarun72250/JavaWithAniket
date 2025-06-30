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
 	
 	//getter fn : If i want to get our private dm of this class into some another class , so i used Getter() methods.
 	//instance member method
 	public double calculateCost() {
 		return this.cost;
 	}

	
	public String getTitle() {
		return title;
	}


	public String getAuthor() {
		return author;
	}

	public double getCost() {
		return cost;
	}
 	
}
