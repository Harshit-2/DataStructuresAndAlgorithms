import java.lang.reflect.Array;
import java.util.*;

class Main {
    public static int[] missingAndRepeating(int[] arr, int n) {
        int missing = -1;
        int repeating = -1;
        int[] result = new int[2];
        for (int i = 1; i <= n; i++) {
        int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i == arr[j]) count++;
            }
            if(count == 0) missing = i;
            if(count > 1) repeating = i;
        }
        
        result[0] = missing;
        result[1] = repeating;
        return result;
  }

  public static void main(String[] args) {
    int[] arr = { 4, 3, 6, 2, 1, 1 };
    System.out.println(missingAndRepeating(arr, 6));
  }
}
