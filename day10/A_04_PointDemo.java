package day10;

public class A_04_PointDemo {

	public static void main(String[] args) {
		
		A_04_Point p1;//refrence variable
		p1 = new A_04_Point();//default cons calling
		p1.display();
		
		A_04_Point p2;//refrence variable
		p2 = new A_04_Point(10,20);//parametrized cons calling
		p2.display();
	}
}
