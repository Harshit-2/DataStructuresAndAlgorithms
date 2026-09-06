import java.lang.reflect.Array;
import java.util.*;

class Main {
  public static int numberThatAppearsOnce(int []a) {
    HashMap<Integer, Integer> unique = new HashMap();
    for(int i = 0; i < a.length; i++) {
      unique.put(a[i], unique.getOrDefault(a[i], 0) + 1);
    }
    for(Integer key : unique.keySet()) {
      if(unique.get(key) == 1) {
        return key;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 3, 2, 1 };
    System.out.println(numberThatAppearsOnce(arr));
  }
}
