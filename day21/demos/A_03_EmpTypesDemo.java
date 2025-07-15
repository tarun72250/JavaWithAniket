package day21.demos;

import day21.entity.A_03_Admin;
import day21.entity.A_03_Emp;
import day21.entity.A_03_Programmer;
import day21.entity.A_03_SalesManager;
import day21.utils.A_03_ITraveller;

public class A_03_EmpTypesDemo {

	public static void main(String[] args) {
		
		A_03_Emp [] allEmp;
		allEmp = new A_03_Emp[3];
		allEmp[0] = new A_03_SalesManager(21,06,2025, "Aniket sarsiya", 24,1001,45000.0f, 200000,5000,12);
		allEmp[1] = new A_03_Programmer(21 , 05 , 2025 , "Tarun Rathore" ,20, 105 , 50000 , 8,2500,10);
		allEmp[2] = new A_03_Admin(21,06,2025 , "Rohan Sen",23, 1002 , 76000,40000);
		
	
		for(int i=0 ; i<allEmp.length ; i++)
		{
					allEmp[i].display();
					double salary = allEmp[i].calSalary();
					System.out.println("Calculated sallary: "+salary);
					// Check if the employee is a implementing ITraveller interface
		            if (allEmp[i] instanceof A_03_ITraveller) // To check if the current object supports calculateTA().
		            {
		                A_03_ITraveller traveller = (A_03_ITraveller) allEmp[i];
		                double ta = traveller.calculateTA();
		                System.out.println("Travel Allowance (TA): " + ta);
		            }
					System.out.println("---------------------------------");
		}				
	}
}
