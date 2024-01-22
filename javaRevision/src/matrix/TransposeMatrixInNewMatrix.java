package matrix;

import java.util.Scanner;

public class TransposeMatrixInNewMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter elmnts");
		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[3][3];
		int[][] tArr = new int[arr.length][arr.length];

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {
				tArr[j][i] = arr[i][j] = sc.nextInt();
			}
		}

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				tArr[i][j] = arr[j][i];
//
//			}
//		}

		for (int i = 0; i < tArr.length; i++) {

			for (int j = 0; j < tArr.length; j++) {
				System.out.print(tArr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
