import java.lang.reflect.Array;
import java.util.*;

class Main {
    public static int[] missingAndRepeating(int[] arr, int n) {
        int missing = -1;
        int repeating = -1;
        int[] result = new int[2];
        int[] hash = new int[n+1];

        for (int i = 0; i < arr.length; i++) {
            hash[i] = 0;
            hash[arr[i]]++;
        }

        for (int i = 0; i <= n; i++) {
            if (hash[i] == 2) repeating = i;
            else if(hash[i] == 0) missing = i;
        }
        result[0] = repeating;
        result[1] = missing;
        return result;
  }

  public static void main(String[] args) {
    int[] arr = { 4, 3, 6, 2, 1, 1 };
    System.out.println(Arrays.toString(missingAndRepeating(arr, 6)));
  }
}
