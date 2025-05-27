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
		
	   //6 indexOf()
		        System.out.println("\n------indexOf()-------");
				String s7 = "Aniket Learning Java Web Development";
				int res1 = s7.indexOf("Java");//16
				int res2 = s7.indexOf("Mern");//-1
				System.out.println(res1+" "+res2);
	
		//7 lastIndexOf()
		        System.out.println("\n------lastIndexOf()-------");
				String s8 = "Aniket Learning HTML CSS JAVASCRAIPT";
				int output = s8.lastIndexOf("A");
				System.out.println(output);
	   	
	    //8 equals()
		        System.out.println("\n------equals()-------");
		        String s9 ="Aniket Sarsiya";
		        boolean output1 = s9.equals("Aniket Sarsiya");//true
		        boolean output2 = s9.equals("aniket sarsiya");//false
		        System.out.println(output1+" "+output2);
		        
		        boolean output3 ="Ram".equalsIgnoreCase("ram");//true
		        System.out.println(output3);
		        Boolean out3= "DebugShala".equalsIgnoreCase("debugShala"); // returns true it checks only char not upperCase and lowercase condition
			    Boolean out4 = "DebugShala".equalsIgnoreCase("DebugShala "); // returns false
			    System.out.println(out3 +" "+ out4);
	 
	   //9 toLowerCase() and toUpperCase()
		        System.out.println("\n------toLowerCase() and toUpperCase()-------");
			    String word1 = "ANIKET SARSIYA";
			    String word3 = word1.toLowerCase();
			    System.out.println(word3);
			    
			    String word2 = "aniket sarsiya";
			    String word4 = word2.toUpperCase();
			    System.out.println(word4);
		
		//10 trim()
		        System.out.println("\n------trim()-------");
		        String word5 = "            Learn        Share Learn     ";//removed whitespaces from sides
		        System.out.println("Trim the word : " + word5.trim());
		        
		//11 replace()
		        System.out.println("\n------replace()-------");
		        String word6 = "Aniked";
		        System.out.println("Original String :" + word6);
		        String word7 = word6.replace('d' ,'t') ;
		        System.out.println("Replaced n with t -> " + word7);//Aniket
        
		 //12 startsWith(String prefix)
		        System.out.println("\n------startsWith(String prefix)-------");
		        String st1 = "Aniket Sarsiya";
		        boolean startsWith = st1.startsWith("Aniket");//st1 = "Aniket Sarsiya"
		        System.out.println("Starts with Aniket Sarsiya: " + startsWith);//true
				boolean startsWith1 = st1.startsWith("Niraj");//st1 = "Aniket Sarsiya"
		        System.out.println("Starts with Aniket Sarsiya: " + startsWith1);//false
		
		//13 endsWith(String suffix)
		        System.out.println("\n------endsWith(String suffix)-------");
		        
		        boolean endsWith = st1.endsWith("siya");//true
		        System.out.println("Ends with 'siya': " + endsWith);
		        
		        boolean endsWith1 = st1.endsWith("tiya");//true
		        System.out.println("Ends with 'tiya': " + endsWith1);
		        
	    // MIMP //14 split(String regex)
		        System.out.println("\n------Split parts:-------");
		        String st2 = "Learning,java,web,developement";
		        String stArr[] =st2.split(",");
		        //advanced for loop
		        for(String part :stArr) {
		        	System.out.println(part);
		        }
		
		//15 equals(Object anObject)
		        System.out.println("\n------equals(Object anObject)-------");
		        String st3 = "DebugShala ";
		        boolean isEqual = st3.equals("debugshala");
		        System.out.println("Strings are equal: " + isEqual);//false
		        
		//16 contains(CharSequence s)
		        System.out.println("\n------contains(CharSequence s)-------");
		        String st4 = "Aniket";
		        boolean contains = st4.contains("Aniket");
		        System.out.println("Contains 'Aniket': " + contains);//true
		        boolean contains1 = st4.contains("aniket");
		        System.out.println("Contains 'aniket': " + contains1);//true		
		
		 //17 isEmpty()
		        System.out.println("\n------isEmpty()-------");     
		        String st5 = "Aniket";
		        boolean isEmpty = st5.isEmpty();
		        System.out.println(isEmpty);//false
		 
		 //18 isEqualIgnoreCase()
		        System.out.println("\n------isEqualIgnoreCase()-------");
		        String var1 = "HELLO";
		        String var2 = "hello";
		        boolean isEqualIgnoreCase = var1.equalsIgnoreCase(var2);//true
		        System.out.println("equalsIgnore case result: " + isEqualIgnoreCase);

		//19  "+" operator in string
				System.out.println("\n---------operator in string----------------");
				String a = "tarun";
				String a1 = " rathore";
				System.out.println(a+a1);//tarun rathore
				System.out.println(a+10);//tarun10
				System.out.println(a+10+20);//tarun1020
				System.out.println(10+20+a);//30tarun
				System.out.println(10+a1+20);//10tarun20
				System.out.println(100+1+34+76+a+20+10+98);//211tarun201098
		
				
		//20 join 
				System.out.println("\n---------join() in string----------------");
				String a2 = " ram";
				System.out.println(String.join(" / ",a,a1,a2));
				System.out.println(String.join(" - ", "A","B","C","D"));//A - B - C - D
				String arr[] = {"tarun","ram","shyam","mohan"};
				String resArr = String.join(" * ", arr);
				System.out.println(resArr);//tarun * ram * shyam * mohan
		
		//21 subsequence (start index and end index)
		        System.out.println("\n---------subSequence() in string----------------");
				String as = " Ramajavademo";
				System.out.println(as.subSequence(3, 5));//ma	
				String as1 = " aniket sarsiya ";
				System.out.println(as1.subSequence(4,7));
	}
}
