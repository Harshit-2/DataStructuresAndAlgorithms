import java.util.*;

class Main {

    public static int maxProductSubArray(ArrayList<Integer> arr, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                max = Math.max(max, product);
            }
        }
        return max;
    }

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(-2, 3, -4, -5));
        System.out.println(maxProductSubArray(arr, 4));
    }
}
