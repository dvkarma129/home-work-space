package matrix;

public class IdentityMatrix {

	public static void main(String[] args) {

		int arr[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		boolean isIdentity = true; 
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j && arr[i][j] != 1) {
					isIdentity = false;
					break;
				} else if (i != j && arr[i][j] != 0) {
					isIdentity = false;
					break;
				}
			}
			
			if (!isIdentity) {
				break;
			}
			
		}

		if (isIdentity) {
			System.out.println("Identity matrix is true");
		} else {
			System.out.println("Not an identity matrix");
		}
	}
}
