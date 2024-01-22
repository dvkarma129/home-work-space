package awdiz;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 18;
		int prime = 0;
		for (int i = 2; i < n; i++) {
			if (n%i==0) {
				prime++;
				break;
			}
		}
		
		if (prime==0) {
			System.out.println("is pirme");
		} else {
			System.out.println("not pirme");
		}

	}

}
