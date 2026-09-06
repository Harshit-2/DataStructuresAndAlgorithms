import java.lang.reflect.Array;
import java.util.Arrays;

public class Lesson148FrogJumpMemoization {

    public static int solve(int ind, int[] height, int[] dp) {
        if (ind == 0) return 0;
        if (dp[ind] != -1) return dp[ind];
        int jumpOne = solve(ind-1, height, dp) + Math.abs(height[ind-1] - height[ind]);
        int jumpTwo = Integer.MAX_VALUE;
        if(ind > 1) jumpTwo = solve(ind-2, height, dp) + Math.abs(height[ind-2] - height[ind]);
        dp[ind] = Math.min(jumpOne, jumpTwo);
        return dp[ind];
    }

    public static int frogJump(int n, int[] height, int[] dp) {
        return solve(n - 1, height, dp);
    }
    
    public static void main(String[] args) {
        int n = 6;
        int[] height = { 30, 10, 60, 10, 60, 50 };
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(frogJump(n, height, dp));
    }
}
