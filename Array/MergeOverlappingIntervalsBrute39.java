// Optimal is better than brute force

import java.util.*;

public class Main {

    public static List<int[]> mergeOverlappingIntervals(int[][] arr) {
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < arr.length; i++) {
            int start = arr[i][0];
            int end = arr[i][1];

            if (ans.isEmpty()) {
                ans.add(new int[]{start, end});
            } else {
                int[] last = ans.get(ans.size() - 1);

                if (start <= last[1]) {
                    last[1] = Math.max(last[1], end);
                } else {
                    ans.add(new int[]{start, end});
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[][] arr = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };

        List<int[]> result = mergeOverlappingIntervals(arr);

        for (int[] interval : result) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }
}
