package day13;

public class A_13_StudentExtend {

		private int rollNumber;
		private String name;
		private int noOfSubjects;
		private int [] noOfMarks;
	
	    //default cons 
		public A_13_StudentExtend() {
		}
		
		//para cons
		public A_13_StudentExtend(int rollNumber, String name,int noOfSubjects,int [] marks) {
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
			System.out.println("Student Name : "+this.name);
//			if(noOfMarks == null) {
//				System.out.println("No of Marks is 0 or not initialized.");
//				return;
//			}
//			
//			for(int i=0;i<noOfMarks.length;i++) {
//				System.out.println(noOfMarks[i]+" ");
//			}
//			System.out.println();
			int totalMarks = 0;
			for(int i=0;i<noOfMarks.length;i++) {
				totalMarks += noOfMarks[i];
//				totalMarks = totalMarks + noOfMarks[i];
			}
			double percentage = ((double) totalMarks / (noOfSubjects * 100))* 100;
			System.out.println("Percentage of "+this.name+" is : "+ percentage);
		}
		
		public static void main(String[] args) {
			
			A_13_StudentExtend []  stu ;
			stu = new A_13_StudentExtend[4];
			
			int arr0[] = {98,89,34,54,65};
			stu[0] = new A_13_StudentExtend(1000,"Siya",5,arr0);
			
			int arr1[] = {98,89,34,54,65};
			stu[1] =  new A_13_StudentExtend(1001,"Aniket",5 ,arr1);
			
			int arr2[] = {98,89,34,67,75};
			stu[2] =  new A_13_StudentExtend(1002,"Shubham",5 ,arr2);
			
			int arr3[] = {98,89,34,54,78};
			stu[3] =  new A_13_StudentExtend(1003,"Riya",5 ,arr3);
			
			for(int i=0;i<stu.length;i++) {
				stu[i].display();
				System.out.println();
			}
		}
		
		
}
