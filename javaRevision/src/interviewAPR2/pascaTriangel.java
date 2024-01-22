package interviewAPR2;

import java.util.Scanner;

public class pascaTriangel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows");
		int rows = sc.nextInt();

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < rows - i; j++) {
				System.out.print(" ");
			}

			int numb = 1;
			for (int j = 0; j < i; j++) {
				System.out.print(numb + " ");
				numb = numb * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}
}
