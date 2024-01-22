package stringss;

public class FirstOccurenceOfGivenString {

	public static void main(String[] args) {

		String s1 = "leetcode helps u to build strong dsa";
		String input = "buil";

		String[] s2 = s1.split(" ");

		for (int i = 0; i < s2.length; i++) {
			if (s2[i].equals(input) || s2[i].contains(input)) {
				System.out.println("Index of Given word is " + i);
				break;
			}
		}
	}
}
