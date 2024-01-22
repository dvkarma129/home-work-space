package numb;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numb");
		int n = sc.nextInt();
		
		
		int f = 0, s = 1;
		for (int i = 0; i <= n; i++) {
			int next = f+s;
			System.out.println(f);
			f = s;
			s = next;
		}
	}
}
