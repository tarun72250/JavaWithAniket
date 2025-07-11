package day21.demos;

import day21.entity.A_01_Rectangle;
import day21.utils.A_01_Drawable;

public class A_01_DemoShapes {

	public static void main(String[] args) {
		
		A_01_Drawable [] arr;
		arr = new A_01_Drawable[3];
		
		arr[0] = new A_01_Rectangle(2,4);
		arr[1] = new A_01_Rectangle(5,6);//A_01_Circle
		arr[2] = new A_01_Rectangle(3,6);//A_01_Triangle
		
		for(A_01_Drawable a:arr) {
			a.drawShape();
			System.out.println(a.calArea());
			System.out.println("----------------------\n");
		}
		
	}
}
