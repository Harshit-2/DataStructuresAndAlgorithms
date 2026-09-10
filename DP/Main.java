import java.util.ArrayList;

public class Main {

    public static long solve(int[] valueInHouse) {
        int n = valueInHouse.length;
        int prev = valueInHouse[0];
        int prev2 = 0;
        int cur = 0;

        for (int i = 1; i < n; i++) {
            int pick = valueInHouse[i];
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

    public static long houseRobber(int[] valueInHouse) {
        int n = valueInHouse.length;
        if(n == 1) return valueInHouse[0];
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i != 0) list1.add(valueInHouse[i]);
            if (i != n-1) list2.add(valueInHouse[i]);
        }

        int[] arr1 = list1.stream().mapToInt(Integer::intValue).toArray();
        int[] arr2 = list2.stream().mapToInt(Integer::intValue).toArray();

        return Math.max(solve(arr1), solve(arr2));
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 1, 2, 6 };
        System.out.println(houseRobber(arr));
    }
}
