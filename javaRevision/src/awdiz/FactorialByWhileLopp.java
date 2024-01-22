package awdiz;

public class FactorialByWhileLopp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n =10;
		int fact = 1;
		while (n!=0) {
			fact = fact * n;
			n--;
		}
		System.out.println(fact);
	}

}
