package array_programs;

public class oddandeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,23,43,34,54,55,53,32};
		
		for (int i = 0; i < arr.length; i++) {
			if (i%2!=0) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
