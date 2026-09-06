import java.lang.reflect.Array;
import java.util.*;

class Main {
  public static boolean twoSum(int[] a, int sum) {
    int j = a.length - 1;
    Arrays.sort(a);
    int i = 0;
    while(i < j) {
      if(a[i] + a[j] > sum) {
        j--;
      }
      if(a[i] + a[j] < sum) {
        i++;
      }
      if(a[i] + a[j] == sum) {
        return true;
      }
    }
    return false;
  }


  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 1, 1, 1, 1 };
    System.out.println(twoSum(arr, 3));
  }
}
