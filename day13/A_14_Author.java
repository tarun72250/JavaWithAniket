package day13;

public class A_14_Author {

	 	private String name;
	    private String email;
	    private long mobileNo;
	    
	    //default cons
	    public A_14_Author() {
	    }
	    
	    //para cons 
	    public A_14_Author(String name, String email, long mobileNo) {
	        this.name = name;
	        this.email = email;
	        this.mobileNo = mobileNo;
	    }
	    
	    //getter and setter
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public long getMobileNo() {
	        return mobileNo;
	    }

	    public void setMobileNo(long mobileNo) {
	        this.mobileNo = mobileNo;
	    }

	    
	    public void display() {
	    	System.out.println("Author Name : "+name);
	    	System.out.println("Author email : "+email);
	    	System.out.println("Author mobile no : "+mobileNo);
	    }
	    
	    
	    
	    
	    
	    
	    // Override toString() method
//	    @Override
//	    public String toString() {
//	        return "Author{" +
//	                "name='" + name + '\'' +
//	                ", email='" + email + '\'' +
//	                ", mobileNo=" + mobileNo +
//	                '}';
//	    }
}
