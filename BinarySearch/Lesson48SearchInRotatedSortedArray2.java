package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class Lesson48SearchInRotatedSortedArray2 {
    public static boolean findElement(ArrayList<Integer>arr, int target) {
    int low = 0;
    int high = arr.size()-1;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (arr.get(mid) == target) return true;
        if (arr.get(low) == arr.get(mid) && arr.get(mid) == arr.get(high)) {
            low += 1;
            high -= 1;
            continue;
        }
        else if (arr.get(low) < arr.get(mid)) {
            if (arr.get(low) <= target && target <= arr.get(mid)) high = mid - 1;
            else low = mid + 1;
        } else {
            if (arr.get(mid) <= target && target <= arr.get(high)) low = mid + 1;
            else high = mid - 1;
        }
    }
    return false;
    } 

    public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>(List.of(3,3,1,2,3,3,3,3,3));
    System.out.println(findElement(arr, 3));
    }
}

