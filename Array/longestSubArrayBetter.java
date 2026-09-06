import java.lang.reflect.Array;
import java.util.*;

class del {
  public static int longestSubarray(int[] arr, int sumission) {
    int maxLen = 0;
    int sum = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];

      if(sumission == sum) {
        maxLen = maxLen + 1;
      }

      int rem = sum - sumission;
      if(map.containsKey(rem)) {
        int len = i - map.get(rem);
        maxLen = Math.max(len, maxLen);
      }

      if(!map.containsKey(sum)) {
        map.put(sum, i);
      }
    }
    return maxLen;
  }

   public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 1, 1, 1, 1 };
    System.out.println(longestSubarray(arr, 4));
  }
  
}
