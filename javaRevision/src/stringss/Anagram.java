package stringss;

public class Anagram {

	public static void main(String[] args) {

		String s = "hello";
		String s2 = "llonen";
		String k = "";
		boolean ana = true;
		if (s.length() == s2.length()) {
			for (int i = 0; i < s.length(); i++) {
				if (!s2.contains("" + s.charAt(i))) {
					ana = false;
				}
			}

			if (ana) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		} else {
			System.out.println("lenght mis match not anagram");
		}

	}
}
