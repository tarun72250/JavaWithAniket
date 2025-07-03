package day20;

//this package is used for abstract assignments


//polympoorphism
//Has a relatinship 
//Person Has-a Date
//1.
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
	
	public void display() {
		System.out.println(dd+"/"+mm+"/"+yy);
	}
	
	public void showdate() {
		System.out.println(dd+"-"+mm+"-"+yy);
	}
	
	
	@Override
	public String toString() {
		return "A_01_Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
	
	
	
}
