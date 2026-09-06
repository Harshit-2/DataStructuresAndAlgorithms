import java.util.*;

class Main {
    public static List<Integer> pascalTriangle(int row) {
        List<Integer> map = new ArrayList<>();
        int ans = 1;
        if (row == 0) {
            map.add(1);
            return map;
        }
        for (int i = 0; i < row; i++) {
            if (i == 0)
                map.add(1);
            ans = ans * (row - i);
            ans = ans / (i + 1);
            map.add(ans);
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(pascalTriangle(3));
    }
}
