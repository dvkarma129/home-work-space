package stringss;

public class CheckStringHasAllUniqueChars {

	public static void main(String[] args) {
		
//		String s1 = "hello";//false because l is repeated
		String s1 = "pink";//true because no chars are repeated
		boolean isUnique = false;
		
		for (int i = 0; i < s1.length(); i++) {
			if (s1.indexOf(s1.charAt(i)) != s1.lastIndexOf(s1.charAt(i))) {
				isUnique = false;
			} else {
				isUnique = true;
			}
		}
		
		if (isUnique) {
			System.out.println("string is unique");
		} else {
			System.out.println("string is not unique");
		}
	}
}
