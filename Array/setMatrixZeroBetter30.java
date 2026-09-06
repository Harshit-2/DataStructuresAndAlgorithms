import java.lang.reflect.Array;
import java.util.*;

class Main {
  public static int[][] setMatricolumnZeros(int[][] arr) {
    int[] row = new int[arr.length];
    int[] col = new int[arr[0].length];

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        if (arr[i][j] == 0) {
          row[i] = 1;
          col[j] = 1;
        }
      }
    }

    for (int i = 0; i < arr.length; i++) {
      if (row[i] == 1) {
        makeRowChanges(arr, i);
      }
    }

    for (int i = 0; i < arr[0].length; i++) {
      if (col[i] == 1) {
        makeColChanges(arr, i);
      }
    }
    return arr;
  }

  public static void makeRowChanges(int[][] arr, int row) {
    for (int i = 0; i < arr[0].length; i++) {
      arr[row][i] = 0;
    }
  }

  public static void makeColChanges(int[][] arr, int col) {
    for (int i = 0; i < arr.length; i++) {
      arr[i][col] = 0;
    }
  }

  public static void main(String[] args) {
    int[][] arr = { { 1, 1, 1, 1 },
        { 1, 1, 1, 1 },
        { 1, 0, 1, 1 },
        { 1, 1, 0, 1 },
        { 0, 1, 1, 1 } };

        setMatricolumnZeros(arr);
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
