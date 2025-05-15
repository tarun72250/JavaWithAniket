package day13;

public class GetterExample {

	private int a;
	private String name;
	
	//default cons
	public GetterExample() {
		this.a=0;
		this.name=null;
	}
	
	//para cons
	public GetterExample(int a , String name) {
		this.a=a;
		this.name=name;
	}
	
	//Getter Method in java :- to get any instance variable outside the class
	public int getA() {
		return this.a;
	}
	
	public String getName() {
		return this.name;
	}
	
	public static void main(String[] args) {
	
		GetterExample gs;//refrence variable
		gs = new GetterExample();//default cons
		
		GetterExample gs1;//refrence variable
		gs1 = new GetterExample(2,"Aniket");//para cons
		
		int a = gs1.getA();
		System.out.println(a);
		
		String name = gs1.getName();
		System.out.println(name);
		
	}
}
