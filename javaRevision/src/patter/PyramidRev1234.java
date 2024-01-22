package patter;

import java.util.Scanner;

public class PyramidRev1234 {

	public static void main(String[] args) {

//		* * * * * 
//		 * * * * 
//		  * * * 
//		   * * 
//		    * 

//		0 1 2 3 4 
//		 0 1 2 3 
//		  0 1 2 
//		   0 1 
//		    0 

		Scanner sc = new Scanner(System.in);
		System.out.println("enter rows ");
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
		
//		for (int i = 0; i < n; i++) {
//			
//			for (int j = 0; j < i; j++) {
//				System.out.print(" ");
//			}
//			
//			for (int j = 0; j < n - i; j++) {
//				System.out.print(j + " ");
//			}
//			
//			System.out.println();
//		}		
	}

}
