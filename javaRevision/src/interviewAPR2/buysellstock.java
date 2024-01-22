package interviewAPR2;

public class buysellstock {
	public static void main(String[] args) {
		int arr[] = {7,1,5,3,6,4};

		int lowestPriceTillDate = arr[0];
		int maxProfit = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			int profir = 0;
			
			if (arr[i]>lowestPriceTillDate) {
				profir = arr[i] - lowestPriceTillDate;
				
				if (maxProfit<profir) {
					maxProfit = profir;
				}
			} else {
				lowestPriceTillDate = arr[i];
			}
		}

		System.out.println("Max profit " + maxProfit);
	}
}
