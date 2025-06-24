package day18;


//1. 
public class A_01_Date {

	//instane dm
	private int dd , mm , yy;
	
	//default cons 
	public A_01_Date()
	{	
		
	}
	//para cons 
	public A_01_Date(int dd , int mm , int yy)
	{	
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	
	//toString()
	@Override
	public String toString() {
		return "A_01_Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
	
}
