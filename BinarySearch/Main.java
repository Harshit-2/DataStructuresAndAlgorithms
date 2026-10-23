package BinarySearch;

public class Main {

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

        for(int i = 1; i <= max; i++) {
            if(divideArray(arr, i) <= threshold) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 5, 9 };
        System.out.println(smallestDivisor(arr, 6));
    }
}