package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class Lesson53FindPeakElementBrute {
    public static int findPeak(ArrayList<Integer>arr) {

        for (int i = 1; i < arr.size()-1; i++) {
            if (arr.get(i-1) < arr.get(i) && arr.get(i) > arr.get(i+1)) {
                return i;
            }
        }
        if (arr.get(arr.size()-1) > arr.get(0)) {
                return arr.size()-1;
            }

        else return 0;
    }

    public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>(List.of(1,2,3,4,5));
    System.out.println(findPeak(arr));
    }
}


