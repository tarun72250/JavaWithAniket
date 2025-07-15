package day21.entity;

public class A_04_Student {

	private int rollno;
	private String name;
	private double marks;
	
	public A_04_Student() {
		
	}
	
	public A_04_Student(int rollno , String name ,double marks ) {
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
	}
	
	public int getRollNo() {
		return rollno;
	}
	
	public String getName() {
		return name;
	}
	
	public double getMarks() {
		return marks;
	}
	
	public String toString() {
		return "Name :"+name+ 
				 " RollNo : "+rollno+
				 " Marks : "+marks;
	}
}
