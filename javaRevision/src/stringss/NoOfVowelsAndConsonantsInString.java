package stringss;

public class NoOfVowelsAndConsonantsInString {

	public static void main(String[] args) {

		String s = "qwertyuiopasdfghjklzxcvbnm";
		int vowelCount = 0, consonantsCount = 0;
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				vowelCount++;
			} else {
				consonantsCount++;
			}
		}
		
		System.out.println("vowels = " + vowelCount + "\nConsonants: " + consonantsCount);
	}
}
