package examms;

import java.util.HashMap;
import java.util.Scanner;

public class Count_the_number_of_words_in_a_string_using_HashMap {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to get numbers of words from it");
		String s1 = sc.nextLine();
		
		String s2 [] = s1.split(" ");
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		
		for (int i = 0; i < s2.length; i++) {
			hashMap.put(i, s2[i]);
		}
		
		System.out.println("Numbers of words in given string = " + hashMap.size());
	}
}
