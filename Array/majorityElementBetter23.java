import java.lang.reflect.Array;
import java.util.*;

class Main {
  public static int majorityElement(int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
    }
    for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
      if(entry.getValue() > arr.length/2) {
        return entry.getKey();
      }
    }
    return -1;
  }


  public static void main(String[] args) {
    int[] arr = {2, 2, 2, 2, 2, 2, 2, 2, 3, 4, 5};
    System.out.println(majorityElement(arr));
  }
}
