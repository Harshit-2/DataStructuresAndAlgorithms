import java.util.*;

class Main {
    public static int numberOfSubArraysWithXorK(int[] arr, int k) {
        int xr = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i = 0; i < arr.length; i++) {
            xr ^= arr[i];

            int x = xr ^ k;
            count += map.getOrDefault(x, 0);

            map.put(xr, map.getOrDefault(xr, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        System.out.println(numberOfSubArraysWithXorK(arr, 6));
    }
}