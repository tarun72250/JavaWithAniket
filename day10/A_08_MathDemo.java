package day10;

public class A_08_MathDemo {

	public static void main(String[] args) {
		
		A_08_Math m1 ;//refrence variable
		m1 = new A_08_Math();
		m1.addition(2,4);
		
		A_08_Math m2 ;//refrence variable
		m2 = new A_08_Math();
		m2.addition(2,4,6);
		
		A_08_Math m3 ;//refrence variable
		m3 = new A_08_Math();
		m3.addition(2.4f,4.5f);
		
		A_08_Math m4 ;//refrence variable
		m4 = new A_08_Math();
		m4.addition(2,2.4f,4.5);
		
		System.out.println("==============================\n");
		A_08_Math m5;//refrence variable
		m5 = new A_08_Math();//object create m5
		m5.addition(2, 4);
		m5.addition(1, 2, 3);
		m5.addition(2.4f, 4.2f);
		m5.addition(4, 4.5f, 4.5);
		int result = m5.addition(1, 2, 3, 4);
		System.out.println("Result of 4 integer value :-"+result);
	}
}
