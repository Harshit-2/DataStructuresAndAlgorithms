package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class Lesson48SearchInRotatedSortedArray {
    
    public static int findElement(ArrayList<Integer>arr, int target) {
        int low = 0;
        int high = arr.size()-1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == target) return mid;
            else if (arr.get(low) <= arr.get(mid)) {
                if(arr.get(low) <= target && target <= arr.get(mid)) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            } else {
                if (arr.get(mid) <= target && target <= arr.get(high)) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    } 

    public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>(List.of(11, 3, 4, 5, 6, 7, 8, 9  ));
    System.out.println(findElement(arr, 3));
    }
}
