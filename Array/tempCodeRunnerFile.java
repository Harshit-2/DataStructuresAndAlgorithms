import java.util.*;

class Main {

    public static int maxProductSubArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                int product = 1;
                for (int k = i; k <= j; k++) {
                    product *= arr[k];
                }
                max = Math.max(max, product);
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] arr = { 40, 25, 19, 12, 9, 6, 2 };
        System.out.println(maxProductSubArray(arr));
    }
}
