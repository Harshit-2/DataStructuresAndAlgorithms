package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson47FirstAndLastOccurance {

    static int[] fal = new int[2];
    public static int first(ArrayList<Integer> arr, int target) {
        int low = 0;
        int high = arr.size()-1;
        int ans = arr.size();
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(arr.get(mid) >= target) {
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        fal[0] = ans;
        return ans;
    }


    public static int last(ArrayList<Integer> arr, int target) {
        int low = 0;
        int high = arr.size()-1;
        int ans = arr.size();
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(arr.get(mid) > target) {
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        if (first(arr, target) == -1) { 
            fal[1] = -1;
            return -1;
        }
        else 
        {
            fal[1] = ans-1;
            return ans -1;
        }
    }
    public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>(List.of(0, 0, 1, 1, 2, 2, 2, 2)) ;
    int target = 2;
    int lb = first(arr, target);

    first(arr, target);
    last(arr, target);

    if(lb == arr.size() || arr.get(lb) != target) {
        fal[0] = -1;
        fal[1] = -1;
    } else last(arr, target);

    System.out.println(Arrays.toString(fal));
    }
}
