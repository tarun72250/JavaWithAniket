package day14;

public class B_02_StgringBufferDemo {

	public static void main(String[] args) {
		
		
		StringBuffer sb1 = new StringBuffer("Aniket");
		//append()
		System.out.println(sb1);//Aniket 
		sb1.append(" Sarsiya");
		System.out.println(sb1);//Aniket Sarsiya
		
		//insert()
		sb1.insert(0, "Mr. ");
		System.out.println(sb1);//Mr. Aniket Sarsiya
		
		//delete()
		sb1.delete(0,4);
		System.out.println(sb1);//Aniket Sarsiya
		
		
		//reverse()
		sb1.reverse();
		System.out.println();
	}
}
