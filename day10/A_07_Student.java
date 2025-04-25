package day10;

public class A_07_Student {

	//instance data member , state , feilds
	private int id;
	private float percent;
	
	//default cons
	public A_07_Student() {
		
	}
	//para cons
	public A_07_Student(int id , float percent) {
		this.id=id;
		this.percent=percent;
	}
	
	//intance member method , behaviour , function 
	public void display() {
		if(percent >= 90)
			System.out.println("Student "+id+ " percentage is "+percent+" had grade Excellent");
		else if(percent >= 80 && percent < 90)
			System.out.println("Student "+id+ " percentage is "+percent+" had grade Very Good");
		else if(percent >= 70 && percent < 80)
			System.out.println("Student "+id+ " percentage is "+percent+" had grade Good");
		else if(percent >= 60 && percent < 70)
			System.out.println("Student "+id+ " percentage is "+percent+" had grade Average");
		else if(percent >= 40 && percent < 60)
			System.out.println("Student "+id+ " percentage is "+percent+" had grade Pass");
		else if(percent < 40 )
			System.out.println("Student "+id+ " percentage is "+percent+" had grade Fail");
	}
}
