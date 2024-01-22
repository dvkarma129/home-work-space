package examms;

import java.util.Scanner;

public class String_or_number_is_palindrome_or_not {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to check weather its palindrome or not");
		String s1 = sc.nextLine();
		String rev = "";
		for (int i = s1.length()-1; i >= 0; i--) {
			rev = rev + s1.charAt(i);
		}
		
		if (rev.equals(s1)) {
			System.out.println(  s1+" is palindrome");
		} else {
			System.out.println(  s1+" is not palindrome");
		} 
	}
}
