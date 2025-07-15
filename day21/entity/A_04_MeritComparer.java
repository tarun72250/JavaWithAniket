package day21.entity;

import day21.utils.A_04_Comparer;

public class A_04_MeritComparer implements A_04_Comparer {

	@Override
	public int compare(Object o1, Object o2) {
		A_04_Student s1 = (A_04_Student) o1;
		A_04_Student s2 = (A_04_Student) o2;
		return Double.compare(s1.getMarks(), s2.getMarks());
	}

	
}
