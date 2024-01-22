package stringss;

public class CheckStringRoation {

	public static void main(String[] args) {

		String s1 = "hello";
		String s2 = "ohe";

		if ((s1 + s1).contains(s2)) {
			System.out.println("yes ");
		} else {
			System.out.println("No");
		}
	}

}
