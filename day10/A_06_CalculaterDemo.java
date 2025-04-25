package day10;

public class A_06_CalculaterDemo {

	public static void main(String[] args) {
		
		A_06_Calculater c1;//refrence variable
		c1 = new A_06_Calculater();//default cons calling
		c1.addition();
		
		A_06_Calculater c2;//refrence variable
		c2 = new A_06_Calculater(5,2);//para cons calling
		int result = c2.subtraction();
		System.out.println("Result of Subtraction : "+result);
		
		A_06_Calculater c3;//refrence variable
		c3 = new A_06_Calculater(4,6);//para cons calling
		c3.addition(8);
		
		A_06_Calculater c4;//refrence variable
		c4 = new A_06_Calculater(3,5);//para cons calling
		c4.multiplication();
		
		A_06_Calculater c5;//refrence variable
		c5 = new A_06_Calculater(20,4);//para cons calling
		int result1 = c5.division();
		System.out.println("Result of Division : "+result1);
	}
}
