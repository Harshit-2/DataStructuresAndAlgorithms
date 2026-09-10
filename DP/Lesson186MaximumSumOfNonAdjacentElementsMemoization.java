import java.util.ArrayList;
import java.util.Arrays;

public class Lesson186MaximumSumOfNonAdjacentElementsMemoization {
    public static int solve(ArrayList<Integer> nums, int[] dp, int ind) {
        if (ind == 0) return nums.get(0);
        if (ind < 0) return 0;
        if (dp[ind] != -1) return dp[ind];

        // int pick = nums.get(ind) + solve(nums, dp, ind-2);
        int pick = nums.get(ind);
        if (ind > 1) {
            pick += solve(nums, dp, ind - 2);
        }
        int notPick = 0 + solve(nums, dp, ind-1);
        dp[ind] = Math.max(pick, notPick);
        return dp[ind];
    }

    public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
        int n = nums.size();
		int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return solve(nums, dp, n-1);
	}

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(9);

        System.out.println(maximumNonAdjacentSum(list));
    }
}

