import java.lang.reflect.Array;
import java.util.*;

class Main {
  public static int[][] setMatrixZeros (int[][] arr) {
    for(int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        if(arr[i][j] == 0) {
          makeRowChanges(arr, i);
          makeColumnChanges(arr, j);
        }
      }
    }
    for(int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        if(arr[i][j] == -1) arr[i][j] = 0;
      }
    }
    return arr;
  }

  public static void makeRowChanges(int[][] arr, int row) {
    for (int i = 0; i < arr[0].length; i++) {
        if(arr[row][i] != 0) {
          arr[row][i] = -1;
        }
    }
  }

  public static void makeColumnChanges(int[][] arr, int col) {
    for (int i = 0; i < arr.length; i++) {
        if(arr[i][col] != 0) {
          arr[i][col] = -1;
      }
    }
  }

 
  public static void main(String[] args) {
    int[][] arr = {{1,1,1},
                    {1,0,1},
                    {1,1,1}};
    System.out.println(Arrays.deepToString(setMatrixZeros(arr)));
  }
}
