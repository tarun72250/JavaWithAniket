package day10;

//Method Overloading concept is used 
public class A_08_Math {

		//instance member method , function, behaviour
		public void addition(int a , int b) {
			
			System.out.println("Addition of two numbers : "+(a+b));
		}
		
		public void addition(int a , int b , int c) {
			
			System.out.println("Addition of three numbers : "+(a+b+c));
		}
		
		public void addition(float a , float b) {
			System.out.println("Addition of two float numbers : "+(a+b));
		}
		
		public void addition(int a , float b , double c) {
			System.out.println("Addition of int float or double numbers : "+(a+b+c));
		}
		
		public int addition(int a , int b , int c , int d) {
			int result = a + b + c + d;
			return result;
		}
		
}
