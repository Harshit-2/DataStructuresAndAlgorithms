import java.lang.reflect.Array;
import java.util.*;

class Main {
  public static int numberThatAppearsOnce(int []a) {
   int element = -1;
   for(int i = 0; i < a.length; i++) {
    boolean unique = true;
    for(int j = 0; j < a.length; j++) {
      if (i != j && a[i] == a[j]) {
        unique = false;
      }
    }
    if(unique) {
      element = a[i];
    }
   }
   return element;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 3, 2, 1 };

    System.out.println(numberThatAppearsOnce(arr));
  }
}
