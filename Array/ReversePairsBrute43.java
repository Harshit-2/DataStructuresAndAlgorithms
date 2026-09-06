import java.util.*;

class Main {

    public static int reversePair(int[] arr) {
        int count = 0;
       for(int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if(arr[i] > 2 * arr[j]) {
                count += 1;
            }
        }
       }
       return count;
    }

    public static void main(String[] args) {

        int[] arr = { 40, 25, 19, 12, 9, 6, 2 };
        System.out.println(reversePair(arr));
    }
}
