package day12;

public class A_03_StaticDemo {

	static int x = 10;//888
	int y = 20;//999
	
	public static void main(String[] args) {
		
		 A_03_StaticDemo a = new  A_03_StaticDemo();
		 a.x = 888;
		 a.y = 999;
		 System.out.println(a.x+" "+a.y);//888 999
		 
		 A_03_StaticDemo a2 = new  A_03_StaticDemo();
		 
		 System.out.println(a2.x+" "+a2.y);//888 20
	}
}
