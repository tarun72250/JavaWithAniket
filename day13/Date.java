package day13;

import day10.A_02_Date;

public class Date {

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
			public Date() {
//				dd=00;
//				mm=00;
//				yy=00;
			}
			
			//parametrized cons 
			public Date(int dd , int mm , int yy) {
				this.dd=dd;
				this.mm=mm;
				this.yy=yy;
			}
			
			//instance member method , Behaviour , functions 
			public void showDate() {
				System.out.println(dd+" "+mm+" "+yy);
			}
}
