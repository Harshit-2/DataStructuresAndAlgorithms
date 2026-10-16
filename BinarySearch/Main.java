package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int NthRoot(int n, int m) {

    int low = 1;
    int high = m;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (Math.pow(mid, n) == m) return mid;
        else if (Math.pow(mid, n) > m) high = mid - 1;
        else low = mid + 1;
    }
    return -1;
    }

    public static void main(String[] args) {
    System.out.println(NthRoot(3,27));
    }
}