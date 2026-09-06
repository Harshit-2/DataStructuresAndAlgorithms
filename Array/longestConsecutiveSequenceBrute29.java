import java.lang.reflect.Array;
import java.util.*;

class Main {
  public static int longestConsecutiveSequence (int[] arr) {
    int longest = 1;
    for(int i = 0; i < arr.length; i++) {
      int currLongest = 1;
      int next = arr[i]+1;
      while(linearSearch(arr, next) == true) {
          next += 1;
          currLongest += 1;
      }
      if(currLongest > longest) longest = currLongest;
    }
    return longest;
  }

  public static boolean linearSearch(int[] arr, int num) {
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] == num) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int[] arr = { 102, 4, 100, 1, 101, 3, 2, 1, 1 };
    System.out.println(longestConsecutiveSequence(arr));
  }
}
