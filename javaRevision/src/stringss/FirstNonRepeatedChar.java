package stringss;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		
		String s = "hHello".toLowerCase();
		char [] c = s.toCharArray();
		
		for (int i = 0; i < c.length; i++) {
			if (s.indexOf(c[i]) == s.lastIndexOf(c[i])) {
				System.out.println(c[i]);
				break;
			}
		}
	}
}
