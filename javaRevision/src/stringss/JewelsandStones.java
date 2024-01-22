package stringss;

public class JewelsandStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jewels = "aA";
		String stones = "aAAbbbb";

		int count = 0;

		for (int i = 0; i < jewels.length(); i++) {
			for (int j = 0; j < stones.length(); j++) {
				if (jewels.charAt(i) == stones.charAt(j)) {
					count = count + 1;
				}
			}
		}
		
		System.out.println(count);
	}
}
