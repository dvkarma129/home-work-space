package patter;

import java.util.Scanner;

public class PascalTriangel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			
			int num = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(num + " ");
				num = num * (i -j )/ (j + 1);
			}
			System.out.println();
		}

	}

}
