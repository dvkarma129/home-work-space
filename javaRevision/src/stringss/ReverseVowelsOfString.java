package stringss;

public class ReverseVowelsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s = "heillou".toLowerCase();
		char []  c  = s.toCharArray();
		int i = 0;
		int j = c.length-1;
		
		while (i<j) {
			if (!(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u')) {
				i++;
			} else if (!(c[j]=='a' || c[j]=='e' || c[j]=='i' || c[j]=='o' || c[j]=='u')) {
				j--;
			} else {
				char temp = c[i];
				c[i] = c[j];
				c[j] = temp ;
				i++;
				j--;
			}
		}
		System.out.println(c);
	}

}
