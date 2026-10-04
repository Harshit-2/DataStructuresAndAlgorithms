import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static int solve(ArrayList<Integer> nums) {
        int n = nums.size();
        int prev2 = 0;
        int cur = 0;
        int prev = nums.get(0);
        int val = -1;

        for (int i = 1; i < n; i++) {
            int pick = nums.get(i);
            if (i > 1) {
                pick += prev2;
            }
            int notPick = 0 + prev;
            val = cur = Math.max(pick, notPick);
            prev2 = prev;
            prev = cur;
        }
        return val;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(9);

        System.out.println(solve(list));
    }
}
