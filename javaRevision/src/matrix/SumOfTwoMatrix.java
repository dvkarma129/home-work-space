package matrix;

public class SumOfTwoMatrix {

	public static void main(String[] args) {
		int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int matrix2[][] = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
		int sum[][] = new int[matrix.length][matrix.length];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {

				sum[i][j] = matrix[i][j] + matrix2[i][j];
			}
		}

		for (int i = 0; i < sum.length; i++) {

			for (int j = 0; j < sum.length; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
	}

}
