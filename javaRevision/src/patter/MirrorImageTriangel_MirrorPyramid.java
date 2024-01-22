package patter;

import java.util.Scanner;

public class MirrorImageTriangel_MirrorPyramid {
//	* * * * * 
//	 * * * * 
//	  * * * 
//	   * * 
//	    * 
//	    * 
//	   * * 
//	  * * * 
//	 * * * * 
//	* * * * * 

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n - i; j++) {
				
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}
