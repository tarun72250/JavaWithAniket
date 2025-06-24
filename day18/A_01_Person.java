package day18;

//Object class + their methods 
//2.
public class A_01_Person {

	//intance dm
	private String name;
	private int age;//instance variable
	A_01_Date bdate;//refrence variable 
	
	//default cons
	public A_01_Person() {
		bdate = new A_01_Date();
	}
	
	//para cons
	public A_01_Person(int dd , int mm , int yy , String name , int age) {
		bdate = new A_01_Date(dd,mm,yy);
		this.name=name;
		this.age=age;
	}

	//toString()
	@Override
	public String toString() {
		return "A_01_Person [name=" + name + ", age=" + age + ", bdate=" + bdate.toString() + "]";
	}
	
}
