package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int sqrtN(long N) {
        long low = 0;
        long high = (int) N;
        long ans = Integer.MAX_VALUE;
        while (low <= high) {
            long mid = low + (high-low) / 2;
            if (mid * mid == N) return mid;
            else if (mid * mid > N) {
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return (int)ans-1;
    }

    public static void main(String[] args) {
    System.out.println(sqrtN(8));
    }
}

