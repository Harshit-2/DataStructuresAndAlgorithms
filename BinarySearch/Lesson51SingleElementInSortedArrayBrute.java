package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class Lesson51SingleElementInSortedArrayBrute {
    
    public static int findSingle(ArrayList<Integer>arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.size() == 1) return arr.get(0);
            if(i == 0) {
                if (arr.get(i) == arr.get(i+1)) continue;
                else return arr.get(i);
            }
            else if(i == arr.size()-1) {
                if (arr.get(i) == arr.get(i-1)) continue;
                else return arr.get(i);
            }
            else if (arr.get(i-1) == arr.get(i) || arr.get(i) == arr.get(i+1)) {
                continue;
            } 
            else {
                return arr.get(i);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>(List.of(10));
    System.out.println(findSingle(arr));
    }
}


