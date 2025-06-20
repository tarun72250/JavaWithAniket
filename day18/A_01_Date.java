package day18;

public class A_01_Date {

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
	
	
	@Override
	public String toString() {
		return "A_01_Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
	
}
