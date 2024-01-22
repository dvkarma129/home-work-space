package stringss;

public class OccOfChar {

	public static void main(String[] args) {

		String s = "asdfghjasdfghasdfghasdfghj".toLowerCase();
		String k = "";

		for (int i = 0; i < s.length(); i++) {

			int count = 1;
			if (!k.contains("" + s.charAt(i))) {
				for (int j = i + 1; j < s.length(); j++) {
					if (s.charAt(i) == s.charAt(j)) {
						count++;
						k = k + s.charAt(i);
					}
				}
				System.out.println(s.charAt(i) + " --> " + count);
			}
		}
	}

}
