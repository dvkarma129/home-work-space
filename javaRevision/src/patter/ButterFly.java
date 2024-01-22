package patter;

import java.util.Scanner;

public class ButterFly {
    
//*      *
//**    **
//***  ***
//********
//***  ***
//**    **
//*      *

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ENter rows");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}

			for (int j = 0; j < 2 * (n - i); j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < i * 2; j++) {
				System.out.print(" ");
			}
			for (int j = i; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
