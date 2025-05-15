package day13;

public class SetterExample {

	private int a;
	private String name;
	
	//default cons
	public SetterExample() {
		this.a=0;
		this.name=null;
	}
	
	//para cons
	public SetterExample(int a , String name) {
		this.a=a;
		this.name=name;
	}
	
	//Setter method : it is used to update instance variable
	public void setA(int a) {
		this.a = a;
	}
	
	public int getA() {
		return this.a;
	}
	
	//Setter method for name
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public static void main(String[] args) {
		
		SetterExample gs;//refrence variable
		gs = new SetterExample();//default cons
		
		SetterExample gs1;//refrence variable
		gs1 = new SetterExample(2,"Aniket");//para cons
		
		//getting the value of a 
		int a = gs1.getA();//2
		System.out.println("Before update "+a);
				
		String name = gs1.getName();//2
		System.out.println("Before update "+name);
		
		//==================================================
		//set the value of a
		gs1.setA(5);
		//set the value of name
		gs1.setName("Charul");
		
		//==================================================

		//getting the value of a 
		int a1 = gs1.getA();//5
		System.out.println("After update "+a1);//5
		
		//getting the value of name 
		String name1 = gs1.getName();//charul
		System.out.println("After update "+name1);
		
	}
}
