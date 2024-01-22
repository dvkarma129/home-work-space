package stringss;

public class PalindromeString {

	public static void main(String[] args) {
		
		String s = "public static void main";
		String sen [] = s.split(" ");
		String res = " ";
		for (int i = sen.length-1; i >= 0; i--) {
			res = res + sen[i] + " ";
		}
		
		System.out.println(res);
		
	}
}
