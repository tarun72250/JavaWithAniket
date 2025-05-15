package day13;

public class A_15_Engine {

	private String type;
	private String fuel;
	private int cc;
	
	//default cons
	public A_15_Engine() {
	}
	
	//para cons
	public A_15_Engine(String t, String f, int c)
	{
		this.type=t;
		this.fuel=f;
		this.cc=c;
	}
	
	//getter and setter 
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}	
	    //toString()
		public String toString() {
			return "type: "+ type+" fuel :"+fuel+" cc :"+cc;
		}
}
