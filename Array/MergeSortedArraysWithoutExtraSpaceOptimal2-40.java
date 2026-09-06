import java.lang.reflect.Array;
import java.util.*;

class Main {
    private static void swapIfGreater(long[] arr1, long[] arr2, int ind1, int ind2) {
        if(arr1[ind1] > arr2[ind2]) {
            long temp = arr1[ind1];
            arr1[ind1] = arr2[ind2];
            arr2[ind2] = temp;
        }
    }

  public static void mergeSortedArrays(long[] arr1, long[] arr2, int n, int m) {
   int len = n + m;
   int gap = len/2 + len%2;
   while (gap > 0) {
    int left = 0;
    int right = left + gap;
    while (right < len) {
        // arr1 and arr2
        if(left < n && right >= n) {
            swapIfGreater(arr1, arr2, left, right - n);
        }
        // arr2 and arr2
        else if(left >= n) {
            swapIfGreater(arr2, arr2, left - n, right - n);
        }
        // arr1 and arr1
        else {
            swapIfGreater(arr1, arr1, left, right);
        }
        left++;
        right++;
    }
    if(gap == 1) break;
    gap = (gap / 2) + (gap % 2);
   }
  }

  public static void main(String[] args) {
    long[] arr1 = { 1, 3, 5, 7 };
    long[] arr2 = { 0, 2, 6, 8, 9 };
    mergeSortedArrays(arr1, arr2, 4, 5);
    System.out.println("arr1 = " + Arrays.toString(arr1));
    System.out.println("arr2 = " + Arrays.toString(arr2));
  }
}
