package stringss;

public class LengthOflastWord {

	public static void main(String[] args) {
		
		String s = "abc def ghi jkl mnopq";
		
		String [] s1 = s.split(" ");
		
		String word = s1[s1.length-1];
		System.out.println("Last Word is " + word + " length is " + word.length());
	}
}
 