import java.lang.reflect.Array;
import java.util.*;

class Main {
  public static int[] bestTimeToBuyAndSellStocks(int[] arr) {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    int j = -1;
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] < min) {
        min = arr[i];
        j = i;
      }
      if(max < arr[i] && j < i) {
        max = arr[i];
      }
    }
    int[] res = {min, max};
    return res;
  }


  public static void main(String[] args) {
    int[] arr = {7, 1, 5, 3, 4, 6};
    System.out.println(Arrays.toString(bestTimeToBuyAndSellStocks(arr)));
  }
}

