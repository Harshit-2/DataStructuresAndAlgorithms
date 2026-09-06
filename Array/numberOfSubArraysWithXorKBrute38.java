import java.util.*;

class Main {
  public static int numberOfSubArraysWithXorK(int[] arr, int k) {
    int count = 0;
   for (int i = 0; i < arr.length; i++) {
    for(int j = i; j < arr.length; j++) {
      int xor = 0;
      for (int l = i; l <= j; l++) {
        xor ^= arr[l];
      }
      if(xor == k) count++;
    }
   }
   return count;
  }

  public static void main(String[] args) {
    int[] arr = { 4, 2, 2, 6, 4};
    System.out.println(numberOfSubArraysWithXorK(arr, 6));
  }
}
