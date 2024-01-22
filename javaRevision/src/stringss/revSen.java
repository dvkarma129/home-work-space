package stringss;

public class revSen {

	public static void main(String[] args) {

		String s = "hiii yee good byee seya";
		String[] arr = s.split(" ");
		String res = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			res = res + arr[i] + " ";

		}

		System.out.println(res);
	}

}
