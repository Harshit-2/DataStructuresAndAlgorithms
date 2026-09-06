import java.lang.reflect.Array;
import java.util.*;

class Main {
  public static int[][] setMatricolumnZeros(int[][] arr) {

    int col0 = 1;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        if (arr[i][j] == 0) {
          arr[i][0] = 0;
          if(j != 0) arr[0][j] = 0;
          else col0 = 0;
        }
      }
    }
    
    for(int i = arr.length -1; i > 0; i--) {
        for(int j = arr[0].length -1; j > 0; j--) {
            if(arr[0][j] == 0 || arr[i][0] == 0) arr[i][j] = 0;
        }
    }
    
    if(arr[0][0] == 0) {
        for(int i=0; i < arr[0].length; i++) {
            arr[0][i] = 0;
        }
    }
    
    if(col0 == 0)  {
        for(int i=0; i < arr.length; i++) {
            arr[i][0] = 0;
        }
    }
    
    return arr;
  }

  public static void main(String[] args) {
    int[][] arr = { { 1, 1, 1, 0 },
                    { 1, 0, 1, 1 },
                    { 1, 1, 0, 1 },
                    { 1, 1, 1, 1 } };

    arr = setMatricolumnZeros(arr);
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
