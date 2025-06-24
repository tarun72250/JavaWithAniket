package day18;


//6.
public class A_01_Admin extends A_01_Emp{

	//extra state 
	private int bonus;
	
	//default cons
	public A_01_Admin() {
		
	}
	
	//para cons
	public A_01_Admin(int dd , int mm , int yy , String name , int age , int empid , double sallary, int bonus) {
		super(dd,mm,yy,name,age,empid,sallary);
		this.bonus=-bonus;
	}
	
	@Override
	public String toString() {
		return "A_01_Admin [bonus=" + bonus + ", toString()=" + super.toString() + "]";
	}
}
