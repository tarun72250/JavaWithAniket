package day14;

public class A_04_StringDemo {

	public static void main(String[] args) {
		
		
		//compareTo()------------------- return type int 
		//String literals
		String s = "A";//65
		String s1 = "a";//97
		
		int res = s.compareTo(s1);//65 - 97 = -32
		System.out.println(res);
		//===============================================
		String s2 = "a";//97
		String s3 = "A";//65
		
		int res1 = s2.compareTo(s3);//97 - 65 = 32
		System.out.println(res1);//32
		//===============================================
		String s4 = "aB";//66
		String s5 = "ab";//98
		
		int res2 = s4.compareTo(s5);//66-98=-32
		System.out.println(res2);//-32
		//===============================================
		String s6 = "aB";//66
		String s7 = "aC";//67
		
		int res3 = s6.compareTo(s7);//66-67=-1
		System.out.println(res3);//-1
		//===============================================
		//copareToIgnoreCase()
		String s8 = "aB";//66
		String s9 = "ac";//99
		
		int res4 = s8.compareToIgnoreCase(s9);//66-67=-1
		System.out.println(res4);//-1	
		
	}
}
