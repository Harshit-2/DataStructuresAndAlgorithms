package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class Lesson51SingleElementInSortedArrayOptimal {
    public static int findSingle(ArrayList<Integer>arr) {
        int low = 1;
        int high = arr.size()-2;
        if (arr.size() == 1) return arr.get(0);
        if (arr.get(0) != arr.get(1)) return arr.get(0);
        if (arr.get(arr.size()-1) != arr.get(arr.size()-2)) return arr.get(arr.size()-1);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) != arr.get(mid-1) && arr.get(mid) != arr.get(mid+1)) return arr.get(mid);
            else {
                if (mid % 2 == 1 && arr.get(mid) == arr.get(mid-1) || (mid % 2 == 0 && arr.get(mid) == arr.get(mid+1)))  {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>(List.of(10, 10, 14, 16, 16, 25, 25, 28, 28, 36, 36, 44, 44 ));
    System.out.println(findSingle(arr));
    }
}

