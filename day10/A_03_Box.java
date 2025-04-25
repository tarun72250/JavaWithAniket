package day10;

public class A_03_Box {

	//instance data member , state , feilds
	private int height;
	private int width;
	private int depth;
	
	//default constructors 
	public A_03_Box() {
	}
	
	//Fully Parametrized Cons
	public A_03_Box(int h , int w , int d) {
		this.height=h;
		this.width=w;
		this.depth=d;
	}
	
	//Partially parametrized cons
	public A_03_Box(int height, int width) {
		this.height=height;
		this.width=width;
	}
	
	
	//Method Overloading
	//instance member method , functions , Behaviour
	public void calVolume() {
		int result = height * width * depth;
		System.out.println("Volume of the Box : "+result);
	}
	
	public int calVolume(int h , int w , int d) {
		
		int result = h * d * w;
		return result;
	}
	
	public double calVolume(double h, double w , double d) {
		double result = h*w*d;
		return result;
	}
	
	public float calVolume(float h , float w , float d) {
		
		return h*w*d;
	}
}
