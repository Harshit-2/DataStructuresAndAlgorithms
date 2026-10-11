package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static int findRotationCount(int[] arr) {
        int low = 0; 
        int high = arr.length-1;
        int ind = -1;
        int min = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[low] <= arr[mid]) {
                if(arr[low] < min) {
                    min = arr[low];
                    ind = low;
                }
                low = mid + 1;
            }
            else {
                if(arr[mid] < min) {
                    min = arr[mid];
                    ind = mid;
                }
                high = mid - 1;
            }
        }
        return ind;
    }

    public static void main(String[] args) {
    // ArrayList<Integer> arr = new ArrayList<>(List.of(3,3,1,2,3,3,3,3,3));
    int[] arr = new int[] { 5,6,1,2,3,4 };
    System.out.println(findRotationCount(arr));
    }
}
