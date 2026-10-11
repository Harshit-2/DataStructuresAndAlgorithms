package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson47FirstAndLastOccuranceBrute {
    public static int[] firstAndLastOccurance(ArrayList<Integer> arr, int target) {
        int first = -1;
        int last = -1;
        int[] ans = new int[2];
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == target) {
                if(first == -1) first = i;
                if(last == -1) last = i;
                else {
                    last = i;
                }
            }
        }

        ans[0] = first;
        ans[1] = last;
        return ans;
    }
    public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>(List.of(3, 3, 4, 4, 5, 6 )) ;
    System.out.println(Arrays.toString(firstAndLastOccurance(arr, 5)));
    }
}
