package day13;

import day10.A_02_Date;

public class Person {
	
	//char ch[] = {'a','n','i','k','e','t'};
	String name ;//refrence insatnce variable
    //int dd , mm , yy;
	Date bdate;
	
	//whenever the data member are refrence variable it starts with value as null.
	//default cons
	//2. prevention
	public Person() {
		//name  = null;
		bdate = new Date();
	}
	
	//parametrized cons
	public Person(String name ,int dd, int mm , int yy) {
		this.name=name;
		this.bdate = new Date(dd , mm , yy);//date para cons calling.
	}
	
	//instance member method
	//1. prevention
	public void display() {
		System.out.println("Name : "+name);
//		if(bdate == null) {
//			System.out.println("Birthday is null");
//		}
//		else
//		{
			bdate.showDate();
//		}
	}
	
}
