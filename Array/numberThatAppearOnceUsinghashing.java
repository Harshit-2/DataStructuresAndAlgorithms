import java.lang.reflect.Array;
import java.util.*;

class Main {
  public static int numberThatAppearsOnce(int []a, int maxi) {
    int unique[] = new int[maxi + 1];
    int uniqueElement = -1;
    for(int i = 0; i < a.length; i++) {
      unique[a[i]] += 1;
    }
    for(int i = 0; i < unique.length; i++) {
      if(unique[i] == 1) {
        uniqueElement = i;
        break;
      }
    }
    return uniqueElement;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 3, 2, 1 };
    int maxi = 4;

    System.out.println(numberThatAppearsOnce(arr, maxi));
  }
}
