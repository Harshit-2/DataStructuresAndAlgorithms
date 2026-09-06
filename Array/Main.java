import java.util.*;

class Main {

    public static int frogJump(int n, int[] height, int[] dp) {
        dp[0] = 0;
        for (int i = 1; i < n-1; i++) {
            int jumpOne = dp[i-1] + Math.abs(height[i] - height[i-1]);
            int jumpTwo = dp[i-2] + Math.abs(height[i] - height[i-2]);
            dp[i] = Math.min(jumpOne, jumpTwo);
        }
        return dp[n-1];
    }

     public static void main(String[] args) {
        int n = 6;
        int[] height = { 30, 10, 60, 10, 60, 50 };
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(frogJump(n, height, dp));
    }
}
