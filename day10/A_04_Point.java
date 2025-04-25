package day10;

public class A_04_Point {

	//instance data member , state , feilds
	private int x;
	private int y;
	
	//default cons
	public A_04_Point() {
		
	}
	
	//para cons
	public A_04_Point(int xxx , int y) {
			this.x=xxx;
			this.y=y;
	}
	
	public void display() {
		System.out.println("["+x+","+y+"]");
	}
}
