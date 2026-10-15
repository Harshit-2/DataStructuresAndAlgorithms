package BinarySearch;

public class Lesson55NthRootBrute {
    public static int NthRoot(int n, int m) {

        for (int i = 1; i < m; i++) {
            if(Math.pow(i, n) == m) return i;
            else if(Math.pow(i, n) > m) return -1;
        }
        return -1;
    }

    public static void main(String[] args) {
    System.out.println(NthRoot(3, 8));
    }
}
