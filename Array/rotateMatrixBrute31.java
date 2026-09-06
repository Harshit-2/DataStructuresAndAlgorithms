import java.lang.reflect.Array;
import java.util.*;

class Main {
  public static int[][] rotateMatrix(int[][] arr) {

    int[][] result = new int[arr[0].length][arr.length];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        result[j][arr.length-i-1] = arr[i][j];
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[][] arr = { { 1, 2, 3, 4 },
                    { 5, 6, 7, 8 },
                    { 9, 10, 11, 12 },
                    { 13, 14, 15, 16 } };

    arr = rotateMatrix(arr);
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
