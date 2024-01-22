package stringss;

public class ReverseStringWihtoutChaingingPostionOfSpecialChar {

	public static void main(String[] args) {
		String str = "abc@123";
		char[] arr = str.toCharArray();

		int i = 0;
		int j = arr.length - 1;

		while (i < j) {
			if (!Character.isAlphabetic(arr[i])) {
				i++;
			} else if (!Character.isAlphabetic(arr[j])) {
				j--;
			} else {
				char temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		System.out.println(arr);
	}

}
