package array_programs;

public class Example {

	public static void main(String[] args) {
		int n = 19;
		int prime = 0;
		for (int i = 2; i < n / 2; i++) {

			if (n % i == 0) {
				System.out.println("true");
				prime++;
				break;
			}
		}

		if (prime == 0) {
			System.out.println("prime numb");
		} else {
			System.out.println("not prime numb");

		}
	}
}
