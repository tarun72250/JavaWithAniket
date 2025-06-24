package day18;

//5.
public class A_01_Programmer extends A_01_Emp {

	//extra states 
	private int extraHours;
	private int chargesPerHour;
	
	//default cons
	public A_01_Programmer() {
		super();
	}
	
	//para cons
	public A_01_Programmer(int dd , int mm , int yy , String name , int age , int empid , double sallary , int extraHours, int chargesPerHour) {
		super(dd,mm,yy,name,age,empid,sallary);
		this.extraHours=extraHours;
		this.chargesPerHour=chargesPerHour;
	}
	
	@Override
	public String toString() {
		return "A_01_Programmer [extraHours=" + extraHours + ", chargesPerHour=" + chargesPerHour + ", toString()="
				+ super.toString() + "]";
	}
}
