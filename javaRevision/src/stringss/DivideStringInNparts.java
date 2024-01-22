package stringss;

import java.util.Scanner;

public class DivideStringInNparts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "helloo";
		System.out.println("Enter in how many parts to divide: ");
		int n = sc.nextInt();
		int l = s.length() / n;
		if (s.length() % n == 0) {

			for (int i = 0; i < s.length(); i = i + l) {
				System.out.println(s.substring(i, i + l));
			}
		} else {
			System.out.println("Division not possible");
		}
	}
}
