package stringss;

public class ChecksVowelsInGivenString {

	public static void main(String[] args) {

		String s = "asdfghjzxcvbnmqasdfghzxcvbnmqwertyuipoiuylkjmnbwertyui";
		String k = " ";
		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			if (!k.contains("" + s.charAt(i))) {

				if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'o' || s.charAt(i) == 'i'
						|| s.charAt(i) == 'u') {

					for (int j = i + 1; j < s.length(); j++) {
						if (s.charAt(i) == s.charAt(j)) {
							k = k + s.charAt(i);
							count++;
						}
					}

					System.out.println(s.charAt(i) + " -->>" + count);

				}
			}
		}
	}
}
