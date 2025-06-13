package day16;

public class B_01_Student extends B_01_Person {

	//extra data member
	private int rollNo;
	private String course;
	
	//default cons
	public B_01_Student() {
		
	}
	
	//para cons
	public B_01_Student(String name , int age ,int rollNo , String course ) {
		super(name,age);
		this.rollNo = rollNo;
		this.course = course;
	}
	
	//instance member method
	public void display() {
		super.display();
		System.out.println("Roll No : "+rollNo);
		System.out.println("Course : "+course);
	}
	
	public String toString() {
		return super.toString()+ " Roll No : "+rollNo+" Course : "+course;
	}
}
