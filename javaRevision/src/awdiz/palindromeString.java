package awdiz;

public class palindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "helleh";
		String rev = "";
		for (int i = s.length()-1; i >=0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		if (rev.equals(s)) {
			System.out.println("palindorme");
		} else { 
			System.out.println("not palindorme");
		}
	}

}
