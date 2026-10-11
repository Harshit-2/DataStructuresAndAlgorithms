package BinarySearch;

public class Lesson49FiniMinimumInRotatedSorted {
    public static int findMin(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        int min = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[low] <= arr[mid]) {
                min = Math.min(min, arr[low]);
                low = mid + 1;
            } else {
                min = Math.min(min, arr[mid]);
                high = mid - 1;
            }
        }
        return min;
    }

    public static void main(String[] args) {
    int[] arr = new int[] { 5,6,1,2,3,4 };
    System.out.println(findMin(arr));
    }
}

