package day10;

public class A_02_Date {

		//instance data member , state 
		private int dd;
		private int mm;
		private int yy;
		
		//constructor types :- 
		//1. default cons 
		//2. parametrized cos :- all values getting initialized wich is declared in class.
		//3. partially parametrized cons 
		//4. copy constructor
		
		//default cons 
		public A_02_Date() {
			
		}
		
		//parametrized cons 
		public A_02_Date(int dd , int mm , int yy) {
			this.dd=dd;
			this.mm=mm;
			this.yy=yy;
		}
		//this refrence :- this is to access current object.
		//this may be clear cut differentaition between your local data member or instance data member.
	
		//partially parametrized cons
		public A_02_Date(int dd , int mm) {
			this.dd=dd;
			this.mm=mm;
		}
		
		//partially parametrized cons
		public A_02_Date(int dd) {
			this.dd=dd;
			}
		
		//copy cons 
		public A_02_Date(A_02_Date d) {
			this.dd = d.dd;
			this.mm = d.mm;
			this.yy = d.yy;
			
		}

		//normal instance method or constructor difference 
		//cons is same name as className but method have different.
		//cons do not have any return type but method have.
		
		
		//instance member method , Behaviour , functions 
		public void showDate() {
			System.out.println(dd+" "+mm+" "+yy);
		}
}





