package matrix;

public class DiagonalSumOfMatrix {

	public static void main(String[] args) {
				
		int arr [] [] = {{1,2,3},{4,5,6},{7,8,9}};
		int n = arr.length -1;
		int sum = 0, sum2 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i==j) {					
					sum += arr[i][j]; 
				}
				if (i== n - j) {
					sum2 += arr[i][j]; 
				}
			}
		}
		
		System.out.println("Diagonal sum of top left to bottom right = " + sum + "\nDiagonal sum of top right to bottom left = " + sum2);
	}

}
