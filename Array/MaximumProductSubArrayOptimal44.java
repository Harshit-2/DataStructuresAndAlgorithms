import java.util.*;

class Main {

    public static int maxProductSubArray(ArrayList<Integer> arr, int n) {
        int prefix = 1;
        int suffix = 1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (prefix == 0) prefix = 1; 
            if (suffix == 0) suffix = 1; 

            prefix *= arr.get(i);
            suffix *= arr.get(n-i-1);
            max = Math.max(max, Math.max(prefix, suffix));
        }
        
        return max;
    }

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(-2, 3, -4, -5));
        System.out.println(maxProductSubArray(arr, 4));
    }
}
