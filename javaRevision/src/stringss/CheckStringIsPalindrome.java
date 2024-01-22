package stringss;

public class CheckStringIsPalindrome {

	public static void main(String[] args) {
	
		String s = "abcba";
		String res = "";
		
		for (int i = s.length()-1; i >= 0 ; i--) {
			res = res + s.charAt(i);	
			}
		if (res.equals(s)) {
			System.out.println("paliindrme");
		} else {
			System.out.println("not paliindrme");

		}
		System.out.println(res);
	}
}
