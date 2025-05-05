package day12;

public class A_04_StaticDemo {

	int x = 10;
	static int y = 20;
	
	public void m1() {
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void m2() {
		//System.out.println(x);
		//System.out.println(this.x);
		System.out.println(y);
	}
}
