import java.lang.reflect.Array;
import java.util.*;

class Main {
  public static boolean twoSum(int[] a, int sum) {
    Map<Integer, Integer> map = new HashMap();
    int numRequired = -1;
    for(int i = 0; i < a.length; i++) {
      numRequired = sum - a[i];
      if(map.containsKey(numRequired)) {
        return true;
      } else {
        map.put(a[i], i);
      }
    }
    return false;
  }


  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 1, 1, 1, 1 };
    System.out.println(twoSum(arr, 3));
  }
}
