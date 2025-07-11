package day21.entity;

import day21.utils.A_01_Drawable;

public class A_01_Rectangle implements A_01_Drawable{

	//instance dm
	private int length , breadth;
	
	//default cons
	public A_01_Rectangle() {
		
	}
	
	//para cons 
	public A_01_Rectangle(int length , int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	
	//instance member method and concrete methods
	public void display() {
		System.out.println("Length : "+length);
		System.out.println("Breadth :"+breadth);
	}
	
	@Override
	public double calArea() {
		return length * breadth;
	}

	@Override
	public void drawShape() {
		System.out.println("In Draw shape of Rectangle");
	}

}
