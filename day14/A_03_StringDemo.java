package day14;


//String class constructors
public class A_03_StringDemo {

	public static void main(String[] args) {
		
		String s = new String("Aniket");//in heap and scp both place
		String s1 = "Aniket";//in scp
		
		
		String s2 = "";//default cons
		//======================================
		String s3 = "mohan";//para cons
		//======================================
		StringBuffer sf = new StringBuffer("sita");//StringBuffer cons
		String s4 = new String(sf);
		System.out.println(s4);//sita
		//======================================
		StringBuilder sb = new StringBuilder("gita");
		String s5 = new String(sb);
		System.out.println(s5);//gita
		//======================================
		char ch [] = {101,102,103};
		String s6 = new String(ch);
		System.out.println(s6);
		//======================================
		byte [] b = {1,2,3,4};
		String s7 = new String(b);
		System.out.println(s7);
		//========================================
		String a = " Ramajavademo";
		System.out.println(a.subSequence(3, 5));//is
		
		
	}
}
