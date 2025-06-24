package day18;

public class A_01_EmpTypesDemo {

	public static void main(String[] args) {
		//check emp type if 1 SM , 2 Prog , 3 Admin
		
		A_01_Emp [] allEmp;
		allEmp = new A_01_Emp[3];
		
		allEmp[0] = new A_01_SalesManager(24,06,2025,"Ayush kumawat",23,1001,20000,200000,4000.0);
		allEmp[1] = new A_01_Programmer(25,06,2025,"Shyam Birla",25,1002,30000,12,2000);
		allEmp[2] = new A_01_Admin(26,06,2025,"Gopal Rana",27,1003,40000,5000);
		
		
		for(int i =0;i<allEmp.length;i++) {
			System.out.println("\n-------------------------------------");
			System.out.println(allEmp[i].toString());
		}
	}
}
