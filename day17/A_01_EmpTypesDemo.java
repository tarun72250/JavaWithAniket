package day17;

public class A_01_EmpTypesDemo {

	public static void main(String[] args) {
		
		
		int arr [];
		arr = new int[3];
		arr[0] = 1;
		arr[1] = 11;
		arr[2] = 111;
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		//--------------------------------------------------
		A_01_Emp [] allEmp;
		allEmp = new A_01_Emp[3];
		allEmp[0] = new A_01_SalesManager(21,06,2025, "Aniket sarsiya", 24,1001,45000.0f, 200000,2000);
		allEmp[1] = new A_01_Programmer(21 , 05 , 2025 , "Tarun Rathore" ,20, 105 , 50000 , 8,2500);
		allEmp[2] = new A_01_Admin(21,06,2025 , "Rohan Sen",23, 1002 , 76000,40000);
		
		//i=0 , display method from SalesManager

		//i=1 , display method from Programmer

		//i=2 , display method from Admin
		
		
		//whatever we have done here is called as polymorphism
		for(int i=0 ; i<allEmp.length ; i++)
		{
					allEmp[i].display();
					//same method call .display()
					//called on common entity which is Emp
					//but different implemention will get called from appropriate subtype
					//called polymorphism 
					//same msg given to common entity but it is implemented differently in different types of entities
					//ex:- cricket match when refry says start every player acts as different role.
					System.out.println("---------------------------------");
		}
		
		
		
				
				
				
					
	}
}
