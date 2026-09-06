import java.lang.reflect.Array;
import java.util.*;

class Main {
  public static int[] nextPermutation(int[] arr) {
    int index = -1;
    int start = -1;
    int min = Integer.MAX_VALUE;
    for(int i = arr.length-1; i > 0; i--) {
      if(arr[i] > arr[i - 1]) {
        index = i-1;
        start = i;
        break;
      }
    }
    if(index == -1) {
        int i = 0;
        int j = arr.length-1;
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

    for(int j = start; j < arr.length; j++) {
      if(arr[j] > arr[index]) {
        min = Math.min(arr[j], min);
      }
    }

    int indexOfMin = -1;
    
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] == min) {
        indexOfMin = i;
      }
    }

    int temp1 = arr[index];
    arr[index] = min;
    min = temp1;

    int temp2 = arr[indexOfMin];
    arr[indexOfMin] = min;
    min = temp2;

    int i = start;
    int j = arr.length - 1;
    while (i < j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
    
    return arr;
  }

  public static void main(String[] args) {
    int[] arr = { 2, 1, 5, 4, 3, 0, 0 };
    System.out.println(Arrays.toString(nextPermutation(arr)));
  }
}
