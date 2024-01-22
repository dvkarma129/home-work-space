package stringss;

public class NoOfPunctuation {

	public static void main(String[] args) {

		String s = "asdfgh!@#$%^&*qawsedrftgyhuj@#$%";
		char c [] = s.toCharArray();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isAlphabetic(c[i]) || Character.isDigit(c[i])) {
				continue;
			} else {
				count++;
				System.out.println(c[i]);				
			}
		}
		System.out.println(count);
	}
}
