package day21.entity;

import day21.utils.A_03_ITraveller;

public class A_03_SalesManager extends A_03_Emp implements A_03_ITraveller {

	private int daysTravelled;
	//extra state 
	private int target ;
	private double incentive;
	
	//default cons
	public A_03_SalesManager() {
		
	}
	//para cons
	public A_03_SalesManager(int dd , int mm , int yy , String name , int age , int empid , double sallary , int target , int incentive,int daysTravelled) {
		super(dd,mm,yy,name,age,empid,sallary);
		this.target=target;
		this.incentive=incentive;
		this.daysTravelled=daysTravelled;
	}
	
	//display
	public void display() {
		super.display();
		System.out.println("Target :"+target);
		System.out.println("Incentive :"+incentive);
		System.out.println("Days per travelled :"+daysTravelled);
	}

	//calSalary()
	public double calSalary() {
		//return super.calSalary() +(super.calSalary() * incentive/100);
//		return salary + (salary * incentive/100);
		System.out.println("Calling From Sales Manager");
		return +super.getSalary() + (super.getSalary() * incentive /100);
	}
	
	
	@Override
	public double calculateTA() {
		return (getSalary() * DA / 100)* daysTravelled;
	}
	
	
}
