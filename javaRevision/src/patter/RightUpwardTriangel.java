package patter;

import java.util.Scanner;

public class RightUpwardTriangel {

//	* * * * * 
//	  * * * * 
//	    * * * 
//	      * * 
//	        * 

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter rows ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
