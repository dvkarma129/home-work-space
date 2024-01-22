package array_programs;

public class numbOccuringOddTimes {

	public static void main(String[] args) {
		

        int[] arr = { 30, 30, 50, 20, 30, 33, 50, 30, 50, 30 };
        int res = 0;
        
        for (int i = 0; i < arr.length; i++) {
			int count = 0;
        	for (int j = 0; j < arr.length; j++) {
				
        		if (arr[i]==arr[j]) {
					count++;
				}
			}
        	
        	if (count%2!=0) {
				res = arr[i];
			}
		}
        
        System.out.println(res);
	}
}
