package day21.entity;

import day21.utils.A_03_ITraveller;

public class A_03_Programmer extends A_03_Emp implements A_03_ITraveller  {

	private int daysTravelled;
	//extra state 
	private int extraHours;
	private int chargesPerHour;
	
	//default cons
	public A_03_Programmer() {
		
	}
	//para cons
	public A_03_Programmer(int dd , int mm , int yy , String name , int age , int empid , double sallary , int extraHours , int chargesPerHour , int daysTravelled) {
		super(dd,mm,yy,name,age,empid,sallary);
		this.extraHours=extraHours;
		this.chargesPerHour=chargesPerHour;
		this.daysTravelled=daysTravelled;
	}
	//display
	public void display() {
		super.display();
		System.out.println("Extra Hours : "+extraHours);
		System.out.println("Charges Per Hour : "+chargesPerHour);
		System.out.println("Days Per travelled : "+daysTravelled);
	}
	
	//calSalary()
	public double calSalary() {
		//return super.calSalary()+ (extraHours*chargesPerHour);
//		return salary + (extraHours*chargesPerHour);
		System.out.println("Calling From Programmer");
		return super.getSalary() + (extraHours + chargesPerHour);
	}
	
	@Override
	public double calculateTA() {
		return (getSalary() * DA /100) * daysTravelled;
	}
}
