import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static long houseRobber(int[] valueInHouse) {
        int n = valueInHouse.length;
        int[] dp = new int[n];
        dp[0] = valueInHouse[0];
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            int pick = dp[i];
            if (i > 1) {
                pick += dp[i-2];
            }
            int notPick = 0 + dp[i-1];
            max = Math.max(pick, notPick);
            dp[i] = max;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 1, 2, 6 };
        System.out.println(houseRobber(arr));
    }
}
