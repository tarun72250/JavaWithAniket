package day14;

public class A_05_StringMethods {

	public static void main(String[] args) {
		
		//Declaration 
		String s,s1;
		//initilization 
		//1
		s = new String("aniket");//heap + scp 
		//2
		s1 = "aniket";//literals only scp
		
		//Concatenation
		String s2 = "Learning java with ";
		String s3 = s2+s1;
		System.out.println(s3);
		
		//length()
		int res = s1.length();
		System.out.println(res);
		
		
		//iterating through the string
		for(int i=0;i<s1.length();i++) {
			System.out.println(s1.charAt(i));//0=a 1=n 2=i 3=k 4=e 5=t
		}
		
		//String Methods in Java
		//1 length()  -----------------   return type int
        System.out.println("\n------length()-------");
				System.out.println(s.length());//return 6 char in a String
		
		//2 charAt()  ----------------   return type char
		        System.out.println("\n------charAt()-------");
				System.out.println(s.charAt(4));//return e
				
		//3 substring(3)
		        System.out.println("\n------substring(3)-------");
		        System.out.println(s.substring(3));//ket
	    //4 substring(2,5)
		        System.out.println("\n------substring(2,5)-------");
				System.out.println(s.substring(2,4));//ik
				
		//5 concat()
		        System.out.println("\n------concat()-------");
		        String s5 = " sarsiya";
		        String s6 = s1.concat(s5);
		        System.out.println(s6);
		
	}
}
