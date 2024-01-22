package awdiz;

public class FindAllIndexOfGivenELmnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 7, 7, 8, 8, 10 };
		int target = 8;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				System.out.print(i + ", ");
			}
		}

	}

}
