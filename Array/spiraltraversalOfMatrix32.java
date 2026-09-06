import java.lang.reflect.Array;
import java.util.*;

class Main {
  public static List<Integer> spiralTraversal(int[][] arr) {
    List<Integer> traversal = new ArrayList<>();
    int top = 0;
    int left = 0;
    int bottom = arr[0].length - 1;
    int right = arr.length - 1;

    while (top <= bottom && left <= right) {
      // right
      for (int i = left; i <= right; i++) {
        traversal.add(arr[top][i]);
      }
      top++;

      // bottom
      for (int i = top; i <= bottom; i++) {
        traversal.add(arr[i][right]);
      }
      right--;

      // left
      if (top <= bottom) {
        for (int i = right; i >= left; i--) {
          traversal.add(arr[bottom][i]);
        }
        bottom--;
      }

      // top
      if (left <= right) {
        for (int i = bottom; i >= top; i--) {
          traversal.add(arr[i][left]);
        }
        left++;
      }
    }
    return traversal;
  }

  public static void main(String[] args) {
    int[][] arr = {
        { 1, 2, 3, 4, 5, 6 },
        { 20, 21, 22, 23, 24, 7 },
        { 19, 32, 33, 34, 25, 8 },
        { 18, 31, 36, 35, 26, 9 },
        { 17, 30, 29, 28, 27, 10 },
        { 16, 15, 14, 13, 12, 11 } };

    System.out.println(spiralTraversal(arr));
  }
}
