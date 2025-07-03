package day20;

public class A_01_Admin extends A_01_Emp{
	
	//extra state 
	private int bonus;
	//default cons
	public A_01_Admin() {
		
	}
	//para cons
	public A_01_Admin(int dd , int mm , int yy , String name , int age, int empid , double sallary,int bonus ) {
		super(dd,mm,yy,name,age,empid,sallary);
		this.bonus=bonus;
	}
	
	//display
	public void display() {
		super.display();
		System.out.println("Bonus : "+bonus);
	}
	
	//calSalary()
	public double calSalary() {
		//return super.calSalary() + bonus;
//		return salary + bonus;
		System.out.println("Calling From Admin");
		return super.getSalary() + bonus;
	}
}
