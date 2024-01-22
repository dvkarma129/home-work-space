
package array_programs;

public class SlidingWindowMaximumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,3,-1,-3,5,3,6,7};
		int k = 3;
		if (nums == null || nums.length == 0) {
            System.out.println(0);
        }

        int n = nums.length;

        for (int i = 0; i <= n - k; i++) {
            int max = nums[i];
            for (int j = i + 1; j < i + k; j++) {
                max = Math.max(max, nums[j]);
            }
            System.out.println(max);
        }

	}

}
