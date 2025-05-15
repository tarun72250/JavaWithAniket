package day13;

public class A_14_BookDemo {

	public static void main(String[] args) {
		
		A_14_Book [] barr;
		barr = new A_14_Book[5];
		
		barr[0] = new A_14_Book();//default cons
		barr[1] = new A_14_Book(2000,2,"ShakesPare","s123@gmail.com",76576571878l);//para cons
		barr[2] = new A_14_Book(3000,3,"Pirates","p123@gmail.com",76576571878l);//para cons
		barr[3] = new A_14_Book(4000,4,"Albin d cuseta","c123@gmail.com",76576571878l);//para cons
		barr[4] = new A_14_Book(5000,5,"Ruby","r123@gmail.com",76576571878l);//para cons
		
		
		for(int i=0;i<barr.length;i++) {
			barr[i].display();
			System.out.println("====================\n");
		}
		
	}
}
