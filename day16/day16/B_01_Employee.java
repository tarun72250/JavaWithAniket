package day16;

public class B_01_Employee extends B_01_Person {

	//extra state 
	private int empid;
	private double salary;
	
	//default cons
	public B_01_Employee() {
		super();//it is defaulty available
		//super() : this is the first statement
//		this.empid=10001;
//		this.salary=40000;
	}
	
	//para cons
	public B_01_Employee(String name , int age , int empid , double salary) {
		super(name, age);//super keyword helps to initialized the super class instance data member
		//super is always first statement in sub class methods
		this.empid = empid;
		this.salary = salary;
	}
	
	//instance member method
	public void display() {
		super.display();//super is always first statement in sub class methods
		System.out.println("Empid :"+empid);
		System.out.println("Salary :"+salary);
	}

	@Override
	public String toString() {
		return super.toString()+" Empid : "+ empid+ " Salary : "+salary;
	}	
}
