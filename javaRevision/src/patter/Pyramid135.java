package patter;

import java.util.Scanner;

public class Pyramid135 {

	public static void main(String[] args) {

//        * 
//      * * * 
//    * * * * * 
//  * * * * * * * 
//* * * * * * * * * 

		Scanner sc = new Scanner(System.in);
		System.out.println("ENter rows");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n -i; j++) {
				System.out.print("  ");
			}
			
			for (int j = 0; j <= i*2; j++) {
				System.out.print( i+" ");
			}
			System.out.println();
		}

//        1 
//      2 1 2 
//    3 2 1 2 3 
//  4 3 2 1 2 3 4 

//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < 2 * (n - i); j++) {
//				System.out.print(" ");
//			}
//
//			for (int j = i; j >= 1; j--) {
//				System.out.print(j + " ");
//			}
//
//			for (int j = 2; j <= i; j++) {
//				System.out.print(j + " ");
//			}
//
//			System.out.println();
//		}

	}

}
