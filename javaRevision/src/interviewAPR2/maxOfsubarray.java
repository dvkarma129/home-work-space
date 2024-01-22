package interviewAPR2;
public class maxOfsubarray {
    //kadane's algorithm
    public static void main(String[] args) {
        
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
       
        int sum = 0, tempSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
			
        	tempSum = tempSum + nums[i];
        	
        	if (tempSum> sum) {
				sum = tempSum;
			}
        	
        	if (tempSum<0) {
				tempSum = 0;
			}
		}
        System.out.println("Sum: " + sum);
    }
}
