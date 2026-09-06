import java.lang.reflect.Array;
import java.util.*;

class Main {
  public static int numberThatAppearsOnce(int []a) {
    int xor = 0;
    for(int i = 0; i < a.length; i++) {
      xor = xor ^ a[i];
    }
    return xor;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 3, 2, 1 };
    System.out.println(numberThatAppearsOnce(arr));
  }
}
