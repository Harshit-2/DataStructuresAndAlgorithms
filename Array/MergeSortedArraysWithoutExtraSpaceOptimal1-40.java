import java.lang.reflect.Array;
import java.util.*;

class Main {
  public static void mergeSortedArrays(long[] arr1, long[] arr2) {
   int left = arr1.length-1;
   int right = 0;

   while (left >= 0 && right < arr2.length) {
    if(arr1[left] > arr2[right]){
        long temp = arr1[left];
        arr1[left] = arr2[right];
        arr2[right] = temp;
        left--;
        right++;
    } else break;
   }
   Arrays.sort(arr1);
   Arrays.sort(arr2);
   System.out.println(Arrays.toString(arr1));
   System.out.println(Arrays.toString(arr2));
  }

  public static void main(String[] args) {
    long[] arr1 = { 1, 3, 5, 7 };
    long[] arr2 = { 0, 2, 6, 8, 9 };
    mergeSortedArrays(arr1, arr2);
  }
}
