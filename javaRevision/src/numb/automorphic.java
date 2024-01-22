package numb;

public class automorphic {

	public static void main(String[] args) {

//		int n =  76;
		int n = 122;

		int sq = n * n;

//		String a = String.valueOf(n);
//		String b = String.valueOf(sq);
//		
//		if (b.endsWith(a)) {
//			System.out.println("auto");
//		} else {
//			System.out.println("not auto");
//		}
		int l = 0;
		int t1 = n;
		while (t1 != 0) {
			l++;
			t1 = t1 / 10;
		}

		int ends = 0;
		int t2 = n * n;

		for (int i = 1; i <= l; i++) {
			int rem = t2 % 10;
			ends = ends * 10 + rem;
			t2 = t2 / 10;
		}

		if (ends == n) {
			System.out.println("auto");
		}

	}
}
