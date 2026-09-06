import java.lang.reflect.Array;
import java.util.*;

class Main {
  public static int longestSubarray(int[] a, int sumission) {
    int maxLen = -1;
    for(int i = 0; i < a.length; i++) {
      for(int j = i; j < a.length; j++) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
          sum += a[k];
        }
        if(sum == sumission) {
            if(j-i > maxLen) {
              maxLen = j-i+1;
            }
          }
      }
    }
    return maxLen;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 1, 1, 1, 1 };
    System.out.println(longestSubarray(arr, 4));
  }
}
