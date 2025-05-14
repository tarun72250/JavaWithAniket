package day13;

public class A_12_Student {

	private int rollNumber;
	private String name;
	private int noOfSubjects;
	private int [] noOfMarks;
	
	//default cons 
	public A_12_Student() {
	}
	
	//para cons
	public A_12_Student(int rollNumber, String name,int noOfSubjects,int [] marks) {
		this.rollNumber = rollNumber;
		this.name=name;
		this.noOfSubjects=noOfSubjects;
		this.noOfMarks = new int[noOfSubjects];
		for(int i=0;i<noOfMarks.length;i++) {
			this.noOfMarks[i] = marks[i];
		}
	}
	
	//display method 
	public void display() {
		System.out.println("Roll Number : "+this.rollNumber);
		System.out.println("Student Name : "+this.name);
		System.out.println("No Of Subjects : "+this.noOfSubjects);
		if(noOfMarks == null) {
			System.out.println("No of Marks is 0 or not initialized.");
			return;
		}
		
		for(int i=0;i<noOfMarks.length;i++) {
			System.out.println(noOfMarks[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		
//		A_12_Student s1 ;//refrence variable
//		s1 = new A_12_Student();//default cons
//		s1.display();
//		
//		System.out.println("==========================\n");
//		A_12_Student s2 ;//refrence variable
//		int arr[] = {98,89,73,29};
//		s2 = new A_12_Student(1001,"Aniket",3 ,arr);//para cons cons
//		s2.display();
		
		
		A_12_Student []  stu ;
		stu = new A_12_Student[4];
		
		stu[0] = new A_12_Student();
		int arr[] = {98,89,34,54,65,73};
		stu[1] =  new A_12_Student(1001,"Aniket",6 ,arr);
		
		int arr1[] = {98,89,34};
		stu[2] =  new A_12_Student(1002,"Shubham",3 ,arr1);
		
		int arr2[] = {98,89,34,54};
		stu[3] =  new A_12_Student(1003,"Riya",4 ,arr2);
		
		for(int i=0;i<stu.length;i++) {
			stu[i].display();
			System.out.println();
		}
		
	}
}
