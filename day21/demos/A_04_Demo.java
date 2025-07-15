package day21.demos;

import java.util.Arrays;
import java.util.Scanner;

import day21.entity.A_04_MeritComparer;
import day21.entity.A_04_NameComparer;
import day21.entity.A_04_RollComparer;
import day21.entity.A_04_Student;
import day21.utils.A_04_Comparer;

public class A_04_Demo {

	public static void main(String[] args) {
		
		A_04_Student [] stuArr = {
				new A_04_Student(11,"Charlie",85.2),
				new A_04_Student(18,"Dhiraj",90.2),
				new A_04_Student(23,"Tejas",88.2),
		};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose sorting criteria:");
        System.out.println("1. Roll Number");
        System.out.println("2. Name");
        System.out.println("3. Marks");
        System.out.print("Enter your choice (1-3): ");
        int choice = sc.nextInt();
        A_04_Comparer comparer;//refrence of interface
        
        switch(choice) {
        case 1:
        	comparer = new A_04_RollComparer();
        	break;
        case 2:
        	comparer = new A_04_NameComparer();
        	break;
        case 3:
        	comparer = new A_04_MeritComparer();
        	break;
        default :
	        System.out.println("Invalid choice..!");
	        return;
        }
        
        sortStudents(stuArr,comparer);
        System.out.println("Sorted Students");
        for(A_04_Student s:stuArr) {
        	System.out.println(s);
        }
	}
	
	public static void sortStudents(A_04_Student [] stuArr ,A_04_Comparer comparer) {
		Arrays.sort(stuArr,(s1,s2)->comparer.compare(s1,s2));
	}
}
