package day14;

public class A_06_StringDemo {

	public static void main(String[] args) {
		
		String st = "Learning Java";
		//using for loop
		for(int i=0;i<st.length();i++) {
			System.out.print(st.charAt(i)+" ");
		}
		
		System.out.println(st.length());
		
		
		//reverse the String
		for(int i=st.length()-1;i>=0;i--) {
			System.out.print(st.charAt(i)+" ");
		}
		
		
		System.out.println();
		String st1 = "welcome";
		String st2 = "";
		
		for(int i=0;i<st1.length();i++) {
			char ch = st1.charAt(i);//welcome
			if(ch!= 'e') {//welcome
				st2 = st2+ch;//wlcom
			}
		}
		System.out.println(st2);//wlcom
	}
}
