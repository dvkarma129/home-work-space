package matrix;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("add elmts");
		int arr [] [] = new int [3] [3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i] [j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
		
			for (int j = 0; j < arr.length; j++) {
				
			System.out.print(arr[j][i] + " ");
			}
			
			System.out.println();
		}
		
	}

}
