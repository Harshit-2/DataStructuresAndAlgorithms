import java.lang.reflect.Array;
import java.util.*;

public class findMissingUsingXor19 {
    public static int missingNumber(int []a, int N) {
        int xor1 = 0;
        int xor2 = 0;
        for (int i = 0; i < a.length; i++) {
            xor1 = a[i] ^ xor1;
            xor2 = (i+1) ^ xor2;
        }
        xor2 ^= (a.length + 1);

        return xor1 ^ xor2;
    }
    
     public static void main(String[] args) {
    int[] arr = { 3, 5, 4, 1 };

    System.out.println(missingNumber(arr, 5));
  }
}
