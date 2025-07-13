package day21.entity;

//3.
public abstract class A_03_Emp extends A_03_Person {

	//extra state
	private int empid;
//	protected double salary;
	private double salary;
	
	//default cons 
	public A_03_Emp() {
		super();
	}
	
	//para cons 
	public A_03_Emp(int dd , int mm , int yy , String name , int age , int empid , double sallary) {
		super(dd,mm,yy,name,age);
		this.empid=empid;
		this.salary=sallary;
	}

	//overridded method from Person class
	public void display() {
		super.display();
		System.out.println("Empid : "+empid);
		System.out.println("Sallary : "+salary);
	}
	
	public abstract double calSalary();
	//employe extra method
//	public double calSalary() {
//		return salary;
//	}
	
	//getter method for sallary 
	public double getSalary() {
		return salary;
	}
}
