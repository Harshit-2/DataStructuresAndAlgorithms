import java.lang.reflect.Array;
import java.util.*;

class Main {
  public static int missingNumber(int []a, int N) {
    int[] hMap = new int [N+1];
    int miss = -1;
    for(int i = 0; i < a.length; i++) {
      hMap[a[i]] = 1;
    }
    for (int i = 1; i <= hMap.length; i++) {
      if(hMap[i] == 0) {
        miss = i;
        break;
      }
    }
    return miss;
    }

  public static void main(String[] args) {
    int[] arr = { 3, 5, 4, 1 };

    System.out.println(missingNumber(arr, 5));
  }
}
