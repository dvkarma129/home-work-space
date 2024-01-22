package stringss;

public class RemoveOccOfCharOnce {

	public static void main(String[] args) {
		
		String s = "Helloe";
		String res = "";
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			
			if (s.charAt(i) == 'e' && count == 1) {
				count = count-1;
				continue;
			} else {
				res = res + s.charAt(i);
			}
			
		}
		
		System.out.println("result " + res);
		
	}
}
