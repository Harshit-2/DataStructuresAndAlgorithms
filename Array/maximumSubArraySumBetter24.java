import java.lang.reflect.Array;
import java.util.*;

class Main {
  public static int maximumSubArraySum(int[] arr) {
    int maxSum = 0;
    for(int i = 0; i < arr.length; i++) {
      int sum = Integer.MIN_VALUE;
      for(int j = i; j < arr.length; j++) {
        sum += arr[j];
        if(sum > maxSum) maxSum = sum;
      }
    }
    return maxSum;
  }


  public static void main(String[] args) {
    int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
    System.out.println(maximumSubArraySum(arr));
  }
}

