package day18;

//4.
public class A_01_SalesManager extends A_01_Emp {

	//extra state
	private int target;
	private double incentive;
	
	//default cons
	public A_01_SalesManager() {
		
	}
	
	//para cons
	public A_01_SalesManager(int dd , int mm , int yy , String name , int age , int empid , double sallary , int target , double incentive) {
		super(dd,mm,yy,name,age,empid,sallary);
		this.target=target;
		this.incentive=incentive;
	}
	
	@Override
	public String toString() {
		return "A_01_SalesManager [target=" + target + ", incentive=" + incentive + ", toString()=" + super.toString()
				+ "]";
	}
	
}
