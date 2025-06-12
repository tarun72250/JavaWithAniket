package day16;

class BiCycle{
	
	//instance data member , state , feild 
	private int gear;
	private int speed;
	
	//default cons
	public BiCycle() {
		
	}
	
	//para cons
	public BiCycle(int gear , int speed) {
		this.gear=gear;
		this.speed=speed;
	}
	
	//applybrakes
	public void applyBrakes(int decrement) {
		speed = speed - decrement;//10-4=6
	}
	
	//speedUp
	public void speedUp(int increment) {
		speed = speed + increment;//10+4=14
	}
	
	//display() toString()
	public String toString() {
		return "Gear :"+gear+" Speed :"+speed;
	}
}

class MountainBike extends BiCycle {
	
	// the MountainBike subclass adds one more field
    public int seatHeight;
    
    //default cons
    public MountainBike() {
    	
    }
    
    //para cons 
    public MountainBike(int gear , int speed , int seatHeight) {
    	super(gear,speed);
    	this.seatHeight=seatHeight;
    }
    
    public void setHeight(int height) {
    	this.seatHeight=height;
    }
    
    //display() toString
    public String toString() {
    	return super.toString() +" Seat height: "+seatHeight;
    }
	
}


public class A_02_SingleInheritance {
	public static void main(String[] args) {
		MountainBike m = new MountainBike(10,100,25);
		String str = m.toString();
		System.out.println(str);
	}
}
