package day14;

public class B_01_StringBufferDemo {

	public static void main(String[] args) {
		
		/*
		StringBuffer class in Java
		StringBuffer is a class in Java that represents a mutable sequence of characters.
        It provides an alternative to the immutable String class, allowing you to modify the contents of a existing 
        string without creating a new object every time.
		*/
		
		
		//Declaration and initializationn
		StringBuffer sb = new StringBuffer();
		sb.append("Jaya");
		System.out.println(sb);
		StringBuffer sb1 = new StringBuffer("Aniket");//22
		System.out.println(sb1.capacity());//22
		
         // append() - Appends the specified string to this character sequence.
			sb1.append(" Hello");
			System.out.println(sb1);
		
         // insert() - Inserts the string at the specified position.
			 System.out.println("\n------insert()-------");
		     sb1.insert(6, " Sarsiya");
		     System.out.println("After insert: " + sb1); // Aniket Sarsiya
	     
	     // replace() - Replaces characters between start and end index
	       	 System.out.println("\n------replace()-------");
		     sb1.replace(0, 6, "Mr.");
		     System.out.println(sb1);
		
	     // delete() - Removes the characters between start and end index
	        System.out.println("\n------delete()-------");
	        sb1.delete(0, 3);
	        System.out.println("After delete: " + sb1); // Sarsiya Hello
	        
	     // deleteCharAt() - Removes character at given index
	        System.out.println("\n------deleteCharAt()-------");
	        StringBuffer sb3 = new StringBuffer("47Billion Java Developer");
	        sb3.deleteCharAt(1);
	        System.out.println("After deleteCharAt(2): " + sb3); // 4Billion Java Developer

	        // reverse() - Reverses the current character sequence
	        System.out.println("\n------reverse()-------");
	        StringBuffer sb4 = new StringBuffer("Learning Java Full Stack");
	        sb4.reverse();
	        System.out.println("Reversed: " + sb4); // kcatS lluF avaJ gninraeL

	        // capacity() - Returns current capacity
	        System.out.println("\n------capacity()-------");
	        StringBuffer sb5 = new StringBuffer();
	        System.out.println("Default Capacity: " + sb5.capacity()); // 16
	        //by default StringBuffer character size is 16
	        
	        // ensureCapacity() - Ensures minimum capacity
	        sb5.ensureCapacity(100);
	        System.out.println("Ensured Capacity (100): " + sb5.capacity()); // >=100

	        // length() - Returns the length (number of characters)
	        System.out.println("\n------length()-------");
	        StringBuffer sb6 = new StringBuffer("Java Programming");
	        System.out.println("Length: " + sb6.length()); // 16

	        // charAt() - Returns char at specified index
	        System.out.println("\n------charAt()-------");
	        System.out.println("Char at 5: " + sb6.charAt(5)); //P

	        // setCharAt() - Sets character at given index
	        System.out.println("\n------setCharAt()-------");
	        sb6.setCharAt(4, '-');
	        System.out.println("After setCharAt(5, '-'): " + sb6); // Java-Programming

	        // substring() - Extracts a substring (Note: StringBuffer returns String)
	        System.out.println("\n------substring()-------");
	        String sub = sb6.substring(0, 4);
	        System.out.println("Substring from index 0 to 4: " + sub); // Java

	        // toString() - Converts StringBuffer to String
	        System.out.println("\n------toString()-------");
	        String str = sb6.toString();
	        System.out.println("Converted to String: " + str);

	        // Comparison (Note: No equals() override for StringBuffer)
	        System.out.println("\n------equals() in StringBuffer-------");
	        StringBuffer cmp1 = new StringBuffer("Test");
	        StringBuffer cmp2 = new StringBuffer("Test");
	        System.out.println("cmp1.equals(cmp2): " + cmp1.equals(cmp2)); // false, reference comparison
	        System.out.println("cmp1.toString().equals(cmp2.toString()): " + cmp1.toString().equals(cmp2.toString())); // true
	   
	        
	        
	}
}
