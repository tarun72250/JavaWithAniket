package day13;

public class A_CarDemo {

	public static void main(String[] args) {
		
		A_15_Engine e1 = new A_15_Engine("v8","petrol",5000);
		
		A_15_Car c1 = new A_15_Car(e1 ,"BMQ","Black");
		System.out.println(c1.toString());;
		
	}
}
