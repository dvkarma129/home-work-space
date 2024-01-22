package patter;

import java.util.Scanner;

public class HallowTriangelPattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			// inner loop to print spaces.
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= (2 * i - 1); k++) {
				// printing stars.
				if (k == 1 || i == n || k == (2 * i - 1)) {
					System.out.print("*");
				}
				// printing spaces.
				else {
					System.out.print(" ");
				}
			}

			System.out.println("");
		}
	}
}
