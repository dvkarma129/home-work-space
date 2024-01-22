package examms;

import java.util.Scanner;

public class Duplicate_characters_in_a_string {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to get duplicate characters");
		String s = sc.nextLine();
		char[] c = s.toCharArray();
		String k = "";

		for (int i = 0; i < c.length; i++) {
			int count = 1;
			if (!k.contains("" + c[i])) {
				for (int j = i + 1; j < c.length; j++) {
					if (c[i] == c[j]) {

						k = k + c[i];
						count++;
					}
				}
			}
			if (count > 1) {
				System.out.println("Character " + c[i] + " count = " + count);
			}
		}
		
	}
}
