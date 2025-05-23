package day14;

public class A_02_StringDemo {

	public static void main(String[] args) {
		
		String s = new String("Aniket");
		String s1 = new String("Aniket");
		
		
		//== operator // it checks both string in heap
		//address comparison
		if(s == s1) {
			System.out.println("Same address");
		}else {
			System.out.println("different address");
		}
		
		//.equals()  // it checks both string in scp 
		//value comparison
		if(s.equals(s1)) {
			System.out.println("same value");
		}else {
			System.out.println("different value");
		}
		
		
		//String literals are created in SCP
		String s2 = "Ram";
		String s3 = "Ram";
		
		//== operator // it checks both string in heap
		//address comparison
		if(s2 == s3) {
			System.out.println("Same address");
		}else {
			System.out.println("different address");
		}
				
		//.equals()  // it checks both string in scp 
		//value comparison
		if(s2.equals(s3)) {
			System.out.println("same value");
		}else {
			System.out.println("different value");
		}
		
	}
}
