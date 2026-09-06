import java.lang.reflect.Array;
import java.util.*;

class del {

  public static int longestSubarray(int[] arr, int sumission) {
   int maxLen = 0;
   int sum = 0;
   int j = 0;
   for (int i = 0; i < arr.length; i++) {
    sum += arr[i];
    if(sum == sumission) {
      maxLen = Math.max(maxLen, i-j + 1);
    }
    while(sum > sumission) {
      sum -= arr[j];
      j++;
    }
   }
   return maxLen;
  }

   public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 1, 1, 1, 1 };
    System.out.println(longestSubarray(arr, 4));
  }
}
