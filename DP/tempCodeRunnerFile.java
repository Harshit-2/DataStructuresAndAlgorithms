import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static int solve(int ind, int[] height, int[] dp, int k) {
        if (ind == 0) return 0;
        if (dp[ind] != -1) return dp[ind];
        int mini = Integer.MAX_VALUE;
        for(int i = 1; i <= k; i++) {
            if (ind >= i) {
                int jump = solve(ind-1, height, dp, k) + Math.abs(height[ind] - height[ind-i]);
                dp[ind] = Math.min(mini, jump);
                mini = dp[ind];
            }
        }
        return mini;
    }
    public static int frogJump(int n, int[] height, int k) {
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return solve(n-1, height, dp, k);

    }

    public static void main(String[] args) {
        int n = 6;
        int[] height = { 30, 10, 60, 10, 60, 50 };
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(frogJump(n, height, 4));
    }
}