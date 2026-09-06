import java.lang.reflect.Array;
import java.util.*;

class Main {
  public static int maxConsecutiveOnes(int []a) {
    int counter = 0;
    int max = 0;
    for(int i = 0; i < a.length; i++) {
      if(a[i] == 1) {
        counter += 1;
      }
      if(counter > max) max = counter;
      if (a[i] == 0) {
        counter = 0;
      }
    }
    return max;
    }

  public static void main(String[] args) {
    int[] arr = { 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1 };

    System.out.println(maxConsecutiveOnes(arr));
  }
}
