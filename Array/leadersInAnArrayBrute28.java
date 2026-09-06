import java.lang.reflect.Array;
import java.util.*;

class Main {
  public static List<Integer> leadersInAnArray(int[] arr) {
    List<Integer> leaders = new ArrayList<>();

    for(int i = 0; i < arr.length; i++) {
    boolean isLeader = true;
      for(int j = i+1; j < arr.length; j++) {
        if(arr[i] < arr[j]) {
          isLeader = false;
          break;
        }
      }
      if(isLeader == true) {
        leaders.add(arr[i]);
      }
    }
    
    return leaders;
  }

  public static void main(String[] args) {
    // int[] arr = { 2, 1, 5, 4, 3, 0, 0 };
    int[] arr = { 10, 22, 12, 3, 0, 6 };
    // System.out.println(Arrays.toString(leadersInAnArray(arr)));
    System.out.println(leadersInAnArray(arr));
  }
}
