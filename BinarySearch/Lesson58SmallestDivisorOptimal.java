package BinarySearch;

public class Lesson58SmallestDivisorOptimal {
    public static int divideArray(int[] arr, int divisor) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans += Math.ceil((double)arr[i] / divisor);
        }
        return ans;
    }

    public static int smallestDivisor(int[] arr, int threshold) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }

        int low = 1;
        int high = max;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(divideArray(arr, mid) > threshold) low = mid + 1;
            else if (divideArray(arr, mid) <= threshold) high = mid - 1;
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 3, 5, 7, 11 };
        System.out.println(smallestDivisor(arr, 6));
    }
}