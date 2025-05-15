package day13;

public class A_15_Car {

	A_15_Engine engine;
	String make;
	String color;
	
	//default cons
	public A_15_Car(){
		engine = new A_15_Engine();
	}
	
	//para cons
	public A_15_Car(String t, String f, int c,String make , String color){
		engine = new A_15_Engine(t,f,c);
		this.make=make;
		this.color=color;
	}
	
	//copy cons
	public A_15_Car(A_15_Engine engine , String make , String color) {
		this.engine=engine;
		this.make=make;
		this.color=color;
	}

	//getter and setter
	public A_15_Engine getEngine() {
		return engine;
	}

	public void setEngine(A_15_Engine engine) {
		this.engine = engine;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	//tostring
	@Override
	public String toString() {
		return "A_15_Car [engine=" + engine + ", make=" + make + ", color=" + color + ", getEngine()=" + getEngine()
				+ ", getMake()=" + getMake() + ", getColor()=" + getColor() + "]";
	}
	
	
	
}
