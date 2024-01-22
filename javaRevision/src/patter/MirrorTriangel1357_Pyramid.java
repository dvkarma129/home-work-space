package patter;

import java.util.Scanner;
//***********
// *********
//  *******
//   *****
//    ***
//     *
//    ***
//   *****
//  *******
// *********
//***********


public class MirrorTriangel1357_Pyramid {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enetr num of rows");
		int n = sc.nextInt();

		for (int i = n; i >= 0; i--) {

			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i * 2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= n; i++) {

			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i * 2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
