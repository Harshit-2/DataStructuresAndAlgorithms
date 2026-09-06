import java.lang.reflect.Array;
import java.util.*;

class Main {
  public static int countSubarraySumEqualsK(int[] arr, int targer) {
    int counter = 0;
    for(int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        int sum = 0;
        for(int k = i; k <= j; k++) {
            sum += arr[k];
        }
        if (sum == target) counter++;
      }
    }
    return counter;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, -3, 1, 1, 1, 4, 2, -3 };

    System.out.println(countSubarraySumEqualsK(arr, 3));
  }
}
