package patter;

import java.util.Scanner;

public class PracticeClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enyer rows");
		int n = sc.nextInt();

		for (int i = n; i >= 1; i--) {

			for (int j = i; j < n ; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				if (j == 1 || i == n  || j == (2 * i - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}

	}

}
