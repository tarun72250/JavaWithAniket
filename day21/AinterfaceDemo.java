package day21;

public interface AinterfaceDemo {

	//data member : static and final
	//methods : abstract and default
	public void m1();//abstract
	//bydefault access modifier : public
	//static method have their body
	static void greet() { // allowed since Java 8
        System.out.println("Hello from static method in interface");
    }
	//You can write a static method in an interface, but it must have a body.
	//❌ You cannot write a static abstract method in an interface.
	
	
	//no cons , no instance data member
}
