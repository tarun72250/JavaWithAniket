package day21;

//Class has an contract with interface to follow their unimplemented methods.
//If not implement class declared as abstract or throw compile time error.

//public abstract class B implements A {
//
////	@Override
////	public void drive() {
////		// TODO Auto-generated method stub
////		
////	}
//
//}


interface B{
	public void b();
}
interface D extends B{
	public void d();
}
class C implements D{
	@Override
	public void d() {
		// TODO Auto-generated method stub
	}
	@Override
	public void b() {
		// TODO Auto-generated method stub	
	}
}



