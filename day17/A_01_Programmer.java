package day17;

public class A_01_Programmer extends A_01_Emp {

	//extra state 
	private int extraHours;
	private int chargesPerHour;
	
	//default cons
	public A_01_Programmer() {
		
	}
	//para cons
	public A_01_Programmer(int dd , int mm , int yy , String name , int age , int empid , double sallary , int extraHours , int chargesPerHour) {
		super(dd,mm,yy,name,age,empid,sallary);
		this.extraHours=extraHours;
		this.chargesPerHour=chargesPerHour;
	}
	//display
	public void display() {
		super.display();
		System.out.println("Extra Hours : "+extraHours);
		System.out.println("Charges Per Hour : "+chargesPerHour);
	}
	
	//calSalary()
	public double calSalary() {
		return super.calSalary()+ (extraHours+chargesPerHour);
	}
}
