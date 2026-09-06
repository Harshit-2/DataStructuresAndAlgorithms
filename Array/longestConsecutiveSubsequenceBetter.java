import java.lang.reflect.Array;
import java.util.*;

class Main {
  public static int longestConsecutiveSequence (int[] arr) {
   Arrays.sort(arr);
   int longest = 1;
   int currMax = 1;
   int prevVal = Integer.MIN_VALUE;
   for(int i = 0; i < arr.length; i++) {
      if(arr[i] - 1 == prevVal) {
        currMax += 1;
        prevVal = arr[i];
      } else if (arr[i] != prevVal) {
        currMax = 1;
        prevVal = arr[i];
      }
      longest = Math.max(longest, currMax);
   }
   return longest;
  }

 
  public static void main(String[] args) {
    int[] arr = { 102, 4, 100, 1, 101, 3, 2, 1, 1 };
    System.out.println(longestConsecutiveSequence(arr));
  }
}
