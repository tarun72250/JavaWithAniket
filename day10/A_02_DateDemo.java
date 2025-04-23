package day10;

public class A_02_DateDemo {

	public static void main(String[] args) {
		
		A_02_Date d1;//refrence variable
		d1 = new A_02_Date();//default cons calling
		d1.showDate();
		
		A_02_Date d2;//refrence variable
		d2 = new A_02_Date(23,04,2025);//para cons calling
		d2.showDate();
		
		
		A_02_Date d3;//refrence variable
		d3 = new A_02_Date(23,04);//partially para cons calling
		d3.showDate();
		
		A_02_Date d4;//refrence variable
		d4 = new A_02_Date(23);//partially para cons calling
		d4.showDate();
		
		A_02_Date d5;//refrence variable 
		d5 = new A_02_Date(d4);//copy cons calling
		d5.showDate();
		
		A_02_Date d6;//refrence variable
		d6 = d4;
		
		
	}
}
