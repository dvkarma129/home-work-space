package array_programs;

//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

public class Stock_buy_sell_max_profit {

	public static void main(String[] args) {

		int arr[] = { 7, 1, 5, 3, 6, 4 };
		
		int lowestPriceTillDate = arr[0];
		int maxProfit = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			int profit = 0;
			
			if (arr[i]>lowestPriceTillDate) {
				profit = arr[i]-lowestPriceTillDate;
				
				if (profit> maxProfit) {
					maxProfit = profit;
				}
			} else {
				lowestPriceTillDate = arr[i];
			}
		}
		
		System.out.println("Max Profit: " + maxProfit);//lowest price index 1 date was 1 and max price was on day 4 was 6 
	
	}
}
