import java.util.ArrayList;
import java.util.Arrays;

public class Lesson187HouseRobber2Memoization {
    public static int solve(int[] arr, int ind, int[] dp) {
        if (ind == 0) return arr[0];
        if (ind < 0) return 0;
        if (dp[ind] != -1) return dp[ind];

        int pick = arr[ind];
        if (ind > 1) {
            pick += solve(arr, ind - 2, dp);
        }
        int notPick = 0 + solve(arr, ind - 1, dp);
        dp[ind] = Math.max(pick, notPick);
        return dp[ind];
    }

    public static long houseRobber(int[] valueInHouse) {
        int n = valueInHouse.length;
        if (n == 1) return valueInHouse[0];
        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i != 0) list1.add(valueInHouse[i]);
            if (i != n-1) list2.add(valueInHouse[i]);
        }

        int[] arr1 = list1.stream().mapToInt(Integer::intValue).toArray();
        int[] arr2 = list2.stream().mapToInt(Integer::intValue).toArray();

        int[] dp1 = new int[arr1.length];
        int[] dp2 = new int[arr2.length];

        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);
        
        return Math.max(
            solve(arr1, arr1.length-1, dp1),
            solve(arr2, arr2.length-1, dp2)
        );
	}

    public static void main(String[] args) {
        int[] arr = { 2, 3, 2 };
        System.out.println(houseRobber(arr));
    }
}
