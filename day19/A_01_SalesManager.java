package day19;

public class A_01_SalesManager extends A_01_Emp {

	//extra state 
	private int target ;
	private double incentive;
	
	//default cons
	public A_01_SalesManager() {
		
	}
	//para cons
	public A_01_SalesManager(int dd , int mm , int yy , String name , int age , int empid , double sallary , int target , int incentive) {
		super(dd,mm,yy,name,age,empid,sallary);
		this.target=target;
		this.incentive=incentive;
	}
	
	//display
	public void display() {
		super.display();
		System.out.println("Target :"+target);
		System.out.println("Incentive :"+incentive);
	}

	//calSalary()
	public double calSalary() {
		//return super.calSalary() +(super.calSalary() * incentive/100);
		return salary + (salary * incentive/100);
	}
	
	
}
