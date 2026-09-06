import java.util.*;

class Main {
  public static int numberOfSubArraysWithXorK(int[] arr, int k) {
    int count = 0;
   for (int i = 0; i < arr.length; i++) {
    int xor = 0;
    for(int j = i; j < arr.length; j++) {
        xor ^= arr[j];
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
