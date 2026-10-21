package BinarySearch;

public class Lesson56KokoEatingBananasBrute {
    
    public static int minimumRateToEatBananas(int []arr, int h) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }

        for (int i = 1; i <= max; i++) {
            int curr = 0;
            for (int j = 0; j < arr.length; j++) {
                curr += Math.ceil((double)arr[j] / i);
                if (curr > h) break;
            }
            if (curr <= h) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{ 7, 15, 6, 3 };
        System.out.println(minimumRateToEatBananas(arr, 8));
    }
}
