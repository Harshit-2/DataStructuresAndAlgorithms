import java.lang.reflect.Array;
import java.util.*;

class Main {
  public static int[] rearrangeArrayElementsBySign(int[] arr) {
   int[] ans = new int[arr.length];
   int cp = 0;
   int cn = 1;
   for(int i = 0; i < arr.length; i++) {
    if(arr[i] > 0) {
      ans[cp] = arr[i];
      cp += 2;
    } else {
      ans[cn] = arr[i];
      cn += 2;
    }
   }
   return ans;
  }


  public static void main(String[] args) {
    int[] arr = { 1, 2, -2, -4, -6, -7, 3, 5 };
    System.out.println(Arrays.toString(rearrangeArrayElementsBySign(arr)));
  }
}

