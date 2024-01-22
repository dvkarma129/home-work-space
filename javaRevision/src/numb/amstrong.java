package numb;

public class amstrong {

	public static void main(String[] args) {

		int n = 153;
		
		int temp1 = n ;
		int power = 0;
		
		while(temp1!=0) {
			power++;
			temp1 = temp1/10;
		}
		
		int temp2 = n;
		int arm =0;
		
		while(temp2!=0) {
			int rem = temp2%10;
			int mul =1;
			for (int i = 0; i < power; i++) {
				mul = mul * rem;
			}
			
			arm = arm + mul;
			temp2 = temp2/10;
		
		}

		if (n == arm) {
			System.out.println("amstrong number");
		} else {
			System.out.println("not an amstrong number");

		}
	}
}
