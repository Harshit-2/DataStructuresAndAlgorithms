package BinarySearch;

public class Lesson57MinimumDaysToMakeBouquetsBrute {
    public static boolean possible(int[] arr, int day, int r, int b) {
        int bouquet = 0;
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= day) {
                counter += 1;
            } else {
                bouquet += counter / r;
                counter = 0;
            }
        }
        bouquet += counter / r;

        if (bouquet >= b) return true;
        else return false;
    }

    public static int roseGarden(int[] arr, int r, int b) {

        if (r*b > arr.length) return -1;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }

        for (int i = min; i <= max; i++) {
            if (possible(arr, i, r, b) == true) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 7, 7, 7, 7, 13, 11, 12, 7 };
        System.out.println(roseGarden(arr, 3, 2));
    }
}
