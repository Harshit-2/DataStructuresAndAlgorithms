package BinarySearch;

public class Lesson56KokoEatingBananasOptimal {
    
    public static int sum(int[] arr, int x) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += Math.ceil((double)arr[i] / x);
        }
        return res;
    }

    public static int minimumRateToEatBananas(int []arr, int h) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        int low = 1;
        int high = max;
        int ans = 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (sum(arr, mid) > h) {
                low = mid + 1;
                ans = low;
            }
            else high = mid - 1;
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr = new int[] { 4, 9, 4, 3, 1, 3 };
        System.out.println(minimumRateToEatBananas(arr, 66));
    }
}