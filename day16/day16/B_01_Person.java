package day16;

public class B_01_Person {

	//instance dm , state , feilds 
	private String name;
	private int age;
	
	//default cons 
	public B_01_Person() {
//		this.name="Mathur";
//		this.age=25;
	}
		
	//Para cons
	public B_01_Person(String name , int age) {
		this.name = name;
		this.age = age;
	}
	
	//instance member methods 
	public void display() {
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
	}

	@Override
	public String toString() {
		return "B_01_Person [name=" + name + ", age=" + age + "]";
	}
}
