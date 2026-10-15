package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class Lesson53FindPeakElementOptimal {
    public static int findPeak(ArrayList<Integer>arr) {

        if(arr.size() == 1) return 0;
        if(arr.get(0) > arr.get(1)) return 0;
        if(arr.get(arr.size()-1) > arr.get(arr.size()-2)) return arr.size()-1;
        int low = 1;
        int high = arr.size()-2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) > arr.get(mid-1) && arr.get(mid) > arr.get(mid+1)) return mid;
            else if (arr.get(mid) > arr.get(mid-1)) low = mid + 1;
            else if (arr.get(mid) > arr.get(mid+1)) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>(List.of(5,4,3,2,1));
    System.out.println(findPeak(arr));
    }
}


