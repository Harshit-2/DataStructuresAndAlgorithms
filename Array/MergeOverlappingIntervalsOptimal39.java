import java.util.*;

public class Main {
    public static List<int[]> mergeOverlappingIntervals(int[][] arr) {
       List<int[]> ans = new ArrayList<>();
       for (int i = 0; i < arr.length; i++) {
        if(ans.isEmpty() || arr[i][0] > ans.get(ans.size()-1)[1]) {
            ans.add(arr[i]);
        }
        else {
            ans.get(ans.size()-1)[1] = Math.max(ans.get(ans.size()-1)[1], arr[i][1]);
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
