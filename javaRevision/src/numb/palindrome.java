package numb;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 1211;

		int temp = n;
		int rev = 0;

		while (temp != 0) {
			int q = temp % 10;
			rev = rev * 10 + q;
			temp = temp / 10;
		}

		if (rev == n) {
			System.out.println("palin");
		} else {
			System.out.println("not a plain");
		}

	}

}
