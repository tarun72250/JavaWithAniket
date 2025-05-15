package day13;

public class ToStringExample {

	  //instance variable
	  private int a;
	  private int b;
	  private int c;
  
	  //default cons
	  public ToStringExample() {
		  
	  }
	  
	  //para cons
	  public ToStringExample(int a,int bb , int c) {
		  this.a=a;
		  b=bb;
		  this.c=c;
	  }

	  public String toString() {
		  return "a :"+a + " b : "+b+" c : "+c;
	  }
	  
	  
	  public static void main(String[] args) {
		
		  ToStringExample t ;
		  t = new ToStringExample();
		 System.out.println( t.toString());
		  
		  System.out.println("============================\n");
		  ToStringExample t1 ;
		  t1 = new ToStringExample(2,3,4);
		  System.out.println(t1);
	}
}
