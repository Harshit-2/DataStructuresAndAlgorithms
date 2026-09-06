import java.lang.reflect.Array;
import java.util.*;

class Main {
    public static int[] missingAndRepeating(int[] arr, int n) {
       long S = 0;
       long S2 = 0;
       long SN = (n * (n + 1)) / 2;
       long S2N = (n * (n + 1) * ((2 * n)  + 1)) / 6;

       for (int i = 0; i < arr.length; i++) {
        S += arr[i];
        S2 += (long)arr[i] * (long)arr[i];
       }

       long val1 = S-SN;
       long val2 = S2-S2N;

       val2 = val2 / val1;

       long x = (val1 + val2) / 2;
       long y = x - val1;
       
       int[] result = {(int)x, (int)y};
       return result; 
       
  }

  public static void main(String[] args) {
    int[] arr = { 4, 3, 6, 2, 1, 1 };
    System.out.println(Arrays.toString(missingAndRepeating(arr, 6)));
  }
}
