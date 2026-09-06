import java.lang.reflect.Array;
import java.util.*;

class Main {
  public static List<Integer> leadersInAnArray(int[] arr) {
    List<Integer> leaders = new ArrayList<>();

    int max = Integer.MIN_VALUE;
    for(int i = arr.length-1; i >= 0; i--) {
      if(arr[i] > max) {
        max = arr[i];
        leaders.add(max);
      }
    }
    
    return leaders;
  }

  public static void main(String[] args) {
    // int[] arr = { 2, 1, 5, 4, 3, 0, 0 };
    int[] arr = { 10, 22, 12, 3, 0, 6 };
    System.out.println(leadersInAnArray(arr));
  }
}
