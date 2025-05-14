package day13;

import java.util.Scanner;

public class A_07_BoxDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height");
		int height = sc.nextInt();
		System.out.println("Enter the width");
		int width = sc.nextInt();
		System.out.println("Enter the depth");
		int depth = sc.nextInt();
		
		A_07_Box [] a ;//refrence array variable
		a = new A_07_Box[4];
		
		a[0] = new A_07_Box();//default cons
		a[1] = new A_07_Box(height,width,depth);//para cons
		a[2] = new A_07_Box(a[1]);//copy cons
		a[3] = new A_07_Box(4,5,6);//para cons
		
		//for displaying the volume of all 3 Box
//		for(int i=0;i<a.length;i++) {
//			a[i].calVolume();
//		}
		
		//for display the maximum volume of the box
		int max = a[0].calVolume();
		for(int i=1;i<a.length;i++) {
			if(max < a[i].calVolume()) {
				max = a[i].calVolume();
			}
		}
		System.out.println("Max valoume calculated : "+max);
		
		
	}
}
