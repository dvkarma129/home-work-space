package interviewAPR1;

public class PrimeFactors {
	public static void main(String[] args) {

		int n = 900;
		
		if (n>2) {
			for (int i = 2; i <=n; i++) {
				while (n%i==0) {
					System.out.print(i + ",");
					n = n/i;
				}
			}
		} else {
			System.out.println("" + n);
		} 
		
	}
}
