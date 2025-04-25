package day10;

public class A_03_BoxDemo {

	public static void main(String[] args) {
		
		A_03_Box b1;//refrence variable 
		b1 =  new A_03_Box();//default cons calling
		b1.calVolume();
		
		A_03_Box b2 ;//refrence variable
		b2 = new A_03_Box(2,3,4);//Full parametrized cons calling.
		b2.calVolume();
		
		A_03_Box b3;
		b3=new A_03_Box(1,2);
		b3.calVolume();
		
		
		//Method Overloading
		A_03_Box b4 ;
		b4 = new A_03_Box();
		int result = b4.calVolume(2, 4, 6);
		System.out.println("Volume of Box : "+result);
		
		A_03_Box b5 ;
		b5 = new A_03_Box();
		double result1 = b5.calVolume(2.0, 4.2, 6.4);
		System.out.println("Volume of Box : "+result1);
		
		A_03_Box b6 ;
		b6 = new A_03_Box();
		float result2 = b6.calVolume(2.0f, 4.2f, 6.4f);
		System.out.println("Volume of Box : "+result2);
	}
}
