package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson47FirstAndLastOptimal2 {
    public static int firstOcc(ArrayList<Integer>arr, int target) {
        int low = 0; int high = arr.size()-1;
        int first = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == target) {
                first = mid;
                high = mid - 1;
            }
            else if (arr.get(mid) < target) low = mid + 1;
            else high = mid - 1;
        }
        return first;
    }

    public static int lastOcc(ArrayList<Integer>arr, int target) {
        int low = 0; int high = arr.size()-1;
        int last = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == target) {
                last = mid;
                low = mid + 1;
            }
            else if (arr.get(mid) < target) low = mid + 1;
            else high = mid - 1;
        }
        return last;
    }

    public static int[] returnAns(ArrayList<Integer> arr, int target) {
        int first = firstOcc(arr, target);
        if (first == -1) return new int[] {-1, -1};
        int last = lastOcc(arr, target);
        int[] ans = { first, last };
        return ans;
    }
    
    public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>(List.of(1, 3, 3, 5)) ;
    System.out.println(Arrays.toString(returnAns(arr, 3)));
    }
}
