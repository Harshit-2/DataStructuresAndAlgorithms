import java.lang.reflect.Array;
import java.util.*;

public class findMissingUsingSumission19 {
    public static int missingNumber(int []a, int N) {
        int sum = (N*(N+1))/2;
        for(int i = 0; i < N; i++) {
            sum -= a[i];
        }
        return sum;
    }
    
     public static void main(String[] args) {
    int[] arr = { 3, 5, 4, 1 };

    System.out.println(missingNumber(arr, 5));
  }
}
