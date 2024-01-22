package array_programs;

public class FrogRiverCrossing {

    public static void main(String[] args) {
        FrogRiverCrossing frog = new FrogRiverCrossing();
        int[] stones = { 0, 1, 3, 5, 6, 8, 12, 17 };
        System.out.println(frog.canCross(stones)); // Output: true
    }

    public boolean canCross(int[] stones) {
        int n = stones.length;

        // Create a 2D array to store if a jump is possible from stone i with jump size
        // j
        boolean[][] dp = new boolean[n][n + 1];
        dp[0][0] = true;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int jumpSize = stones[i] - stones[j];

                if (jumpSize <= j + 1) {
                    // Check if the frog can jump from stone j with jump size jumpSize to stone i
                    dp[i][jumpSize] = dp[j][jumpSize - 1] || dp[j][jumpSize] || dp[j][jumpSize + 1];
                }
            }
        }

        // Check if the frog can reach the last stone
        for (int i = 0; i <= n; i++) {
            if (dp[n - 1][i]) {
                return true;
            }
        }

        return false;
    }

}
