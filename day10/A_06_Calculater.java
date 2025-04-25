package day10;

public class A_06_Calculater {

	//instance data member , state , feilds
	private int no1;//20
	private int no2;//4
	
	//default cons
	public A_06_Calculater() {
		
	}
	
	//fully parametrized cons 
	public A_06_Calculater(int no1 , int no2) {
		this.no1=no1;//20
		this.no2=no2;//4
	}
	
	//instance member method , behaviour , functions
	//addition 
	public void addition() {
		int result = no1 + no2;
		System.out.println("Result of Addition :"+result);
	}
	
	//addition method with one arguement in method
	public void addition(int no3) {
		int result = no1 + no2 + no3;
		System.out.println("Result of 3 Numbers Addition : "+result);
	}
	
	public int subtraction() {
		int result = no1 - no2;//5-2
		return result;//3
	}
	
	public void multiplication() {
		int result = this.no1 * this.no2;
		System.out.println("Result of multiplication : "+result);
	}
	
	public int division() {
		int result = this.no1 / this.no2;
		return result;
	}
}
