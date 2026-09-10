import java.util.ArrayList;

public class Lesson186MaximumSumOfNonAdjacentElementsTabulation {
    public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
    int n = nums.size();
    int[] dp = new int[n];
    dp[0] = nums.get(0);

    for (int i = 1; i < n; i++) {
        int pick = nums.get(i);
        if (i > 1) {
            pick += dp[i-2];
        }
        int notPick = 0 + dp[i-1];
        dp[i] = Math.max(pick, notPick);
        }
        return dp[n-1];
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
