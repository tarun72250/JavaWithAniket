package day16;

public class Singleton {

		//private static instance dm
		private static Singleton singleton = null;
		/* A private Constructor prevents any other
	    * class from instantiating.
	    */
		//private 
		private Singleton() {}
		
		//static instance method
		public static Singleton getInstance() {
			if(singleton == null) {
				singleton = new Singleton();
			}
			return singleton;
		}
	
		protected void display() {
			System.out.println("Demo method for display");
		}
		
		public static void main(String[] args) {
			Singleton x = Singleton.getInstance();
			Singleton y = Singleton.getInstance();
			Singleton z = Singleton.getInstance();
			System.out.println("Hashcode of x is "+ x.hashCode());
			System.out.println("Hashcode of y is "+ y.hashCode());
			System.out.println("Hashcode of z is "+ z.hashCode());
//			
//			Singleton s = new Singleton();
//			s.display();
		}
}
