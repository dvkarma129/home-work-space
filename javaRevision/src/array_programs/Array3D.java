package array_programs;

public class Array3D {

	public static void main(String[] args) {

		int[][] arr = { { 2, 1, 5 }, { 6, 2, 8 }, { 3, 5, 5 } };
		int sum=0;
		int sum1=0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i==j) {
					sum += arr[i][j];
				}
				if(i+j==2) {
					sum1 +=arr[i][j];
				}
			}
		}
		System.out.println();
		System.out.println("sum---->"+sum);
		System.out.println("sum1---->"+sum1);
		System.err.println();

	}

}
