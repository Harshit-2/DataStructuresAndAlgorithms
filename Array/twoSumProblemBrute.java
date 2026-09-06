import java.lang.reflect.Array;
import java.util.*;

class Main {
  public static boolean twoSum(int[] a, int sum) {
    for(int i = 0; i < a.length; i++) {
      for(int j = 0; j < a.length; j++) {
        if(i == j) continue;
        if(a[i] + a[j] == sum) {
          return true;
        }
      }
    }  
    return false;
  }


  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 1, 1, 1, 1 };
    System.out.println(twoSum(arr, 324));
  }
}
