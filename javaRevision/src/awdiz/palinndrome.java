package awdiz;

public class palinndrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 150051;
		
		int temp = n;
		int palin =0;
				
		while (temp!=0) {
			
			int rem = temp%10;
			palin = palin*10+rem;
			temp = temp/10;
		}
		if (n==palin) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
