package stringss;

public class LengthOfAString {

	public static void main(String[] args) {
		
		
		String s1 = "abcde";
		char c [] = s1.toCharArray();
		int length = 0;
		for (int i = 0; i < c.length; i++) {
			length++;
		}
		
		System.out.println(length);
	}
}
