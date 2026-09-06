import java.util.*;

class Main {
  public static List<List<Integer>> pascalTriangle(int rows) {
    List<List<Integer>> allRows = new ArrayList<>();

    for (int j = 0; j < rows; j++) {
        List<Integer> map = new ArrayList<>();
      int row = j;
      if(j == 0) map.add(1);
      int ans = 1;
      for (int i = 0; i < row; i++) {
        if (i == 0)
          map.add(1);
        ans = ans * (row - i);
        ans = ans / (i + 1);
        map.add(ans);
      }
      allRows.add(map);
    }
    return allRows;
  }

  public static void main(String[] args) {
    System.out.println(pascalTriangle(6));
  }
}
