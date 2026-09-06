import java.lang.reflect.Array;
import java.util.*;

class Main {
  public static int[] sortArrayOf012(int[] arr) {
   int low = 0;
   int mid = 0;
   int high = arr.length - 1;
   while(mid <= high) {
    if(arr[mid] == 0) {
      int temp = arr[mid];
      arr[mid] = arr[low];
      arr[low] = temp;
      low++;
      mid++;
    }
    else if(arr[mid] == 1) {
      mid++;
    }
    else {
      int temp = arr[high];
      arr[high] = arr[mid];
      arr[mid] = temp;
      high--;
    }
   }
   return arr;
  }


  public static void main(String[] args) {
    int[] arr = { 1, 2, 0,0,0,0, 1, 1, 1, 1 };
    System.out.println(Arrays.toString(sortArrayOf012(arr)));
  }
}
