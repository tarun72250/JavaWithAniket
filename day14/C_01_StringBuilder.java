package day14;

public class C_01_StringBuilder {

	public static void main(String[] args) {
		
	
	/*
	StringBuilder: 
	StringBuilder in Java represents a mutable sequence of characters.
	 
	Since the String Class in Java creates an immutable sequence of characters, 
	the StringBuilder class provides an alternative to String Class, 
	as it creates a mutable sequence of characters. 
	
	The function of StringBuilder is very much similar to the StringBuffer class, 
	as both of them provide an alternative to String Class by making a mutable 
	sequence of characters.
	
	However, the StringBuilder class differs from the StringBuffer class on the 
	basis of synchronization. 
	
	The StringBuilder class provides no guarantee of synchronization whereas the 
	StringBuffer class does. 
	
	Therefore this class is designed for use as a drop-in replacement for 
	StringBuffer in places where the StringBuffer was being used by a single 
	thread (as is generally the case). 
	
	Where possible, it is recommended that this class be used in preference to 
	StringBuffer as it will be faster under most implementations. 
	
	Instances of StringBuilder are not safe for use by multiple threads. 
	If such synchronization is required then it is recommended that StringBuffer 
	be used. 
	
	String Builder is not thread-safe and high in performance compared to String 
	buffer.
	*/
	StringBuilder sb1 = new StringBuilder("Aniket");
	sb1.append(" Sarsiaya");
	System.out.println(sb1);
	
	//they both have same meaning 
	//by default toString() is present in all classes.
	System.out.println(sb1.toString());
	
	//insert()//Mr. Aniket Sarsiya
	
	//delete()//Aniket Sarsiya
	
	//reverse()//ayisraS tekinA
	
	
	
	}	
}
