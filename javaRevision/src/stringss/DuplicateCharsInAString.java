package stringss;

public class DuplicateCharsInAString {

	public static void main(String[] args) {

		String s = "asdfghjasdfghasdfghasdfghj".toLowerCase();

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
				System.out.println(c[i] + " " + count);
			}
		}
	}
}
