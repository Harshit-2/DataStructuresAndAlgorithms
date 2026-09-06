import java.lang.reflect.Array;
import java.util.*;

class Main {
  public static int majorityElement(int[] arr) {
    int count = 0;
    int firstEl = arr[0];
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] == firstEl) {
        count++;
      } else {
        if(count > 0) {
          count --;
        } else {
          firstEl = arr[i];
        }
      }
    }
    count = 0;
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] == firstEl) count += 1;
    }
    if (count > arr.length/2) return firstEl;
    else return -1;
  }


  public static void main(String[] args) {
    int[] arr = {3, 1, 1, 2, 1};
    System.out.println(majorityElement(arr));
  }
}
