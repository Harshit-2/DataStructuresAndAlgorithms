import java.util.ArrayList;

public class Lesson186MaximumSumOfNonAdjacentElementsTabulationSpaceOptimized {
    public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
    int n = nums.size();
    int prev = nums.get(0);
    int prev2 = 0;
    int cur = 0;

    for (int i = 1; i < n; i++) {
        int pick = nums.get(i);
        if (i > 1) {
            pick += prev2;
        }
        int notPick = 0 + prev;
        cur = Math.max(pick, notPick);
        prev2 = prev;
        prev = cur;
        }
        return prev;
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

