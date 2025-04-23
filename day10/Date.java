package day10;

public class Date {

			//instance data member , state 
			private int dd;
			private int mm;
			private int yy;
			
			//default cons 
			public Date() {
				
			}
			
			//parametrized cons 
			public Date(int dd , int mm , int yy) {
				this.dd=dd;
				this.mm=mm;
				this.yy=yy;
			}
			
			//partially parametrized cons
			public Date(int dd , int mm) {
				this.dd=dd;
				this.mm=mm;
			}
			
			//copy cons 
			public Date(Date d) {
				this.dd = d.dd;
				this.mm = d.mm;
				this.yy = d.yy;
				
			}
	
			//instance member method , Behaviour , functions 
			public void showDate() {
				System.out.println(dd+" "+mm+" "+yy);
			}
			
			public void showDate(char ch) {
				System.out.println(dd+" "+ch+" "+mm+" "+ch+" "+yy);
			}
}
