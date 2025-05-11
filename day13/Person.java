package day13;

import day10.A_02_Date;

public class Person {
	
	//char ch[] = {'a','n','i','k','e','t'};
	String name ;
    //int dd , mm , yy;
	Date bdate;
	
	//whenever the data member are refrence variable it starts with value as null.
	//default cons
	public Person() {
		//name = bdate = null;
	}
	
	//parametrized cons
	public Person(String name ,int dd, int mm , int yy) {
		this.name=name;
		this.bdate = new Date(dd , mm , yy);//date para cons calling.
	}
	
	//instance member method
	public void display() {
		System.out.println("Name : "+name);
		bdate.showDate();
	}
	
}
