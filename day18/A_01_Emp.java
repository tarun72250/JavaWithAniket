package day18;

//3.
public class A_01_Emp extends A_01_Person {

	//extra state
	private int empid;
	private double salary;
	
	//default cons 
	public A_01_Emp() {
		super();
	}
	
	//para cons 
	public A_01_Emp(int dd , int mm , int yy , String name , int age , int empid , double sallary) {
		super(dd,mm,yy,name,age);
		this.empid=empid;
		this.salary=sallary;
	}

	//toString()
	@Override
	public String toString() {
		return "A_01_Emp [empid=" + empid + ", salary=" + salary + ", Person Details=" + super.toString() + "]";
	}
}
