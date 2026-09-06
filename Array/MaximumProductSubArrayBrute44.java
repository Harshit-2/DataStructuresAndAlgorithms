import java.util.*;

class Main {

    public static int maxProductSubArray(ArrayList<Integer> arr, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i; j < arr.size(); j++) {
                int product = 1;
                for (int k = i; k <= j; k++) {
                    product *= arr.get(k);
                }
                max = Math.max(max, product);
            }
        }
        return max;
    }

    public static void main(String[] args) {

         ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(-2, 3, -4, -5));
        System.out.println(maxProductSubArray(arr, 7));
    }
}
