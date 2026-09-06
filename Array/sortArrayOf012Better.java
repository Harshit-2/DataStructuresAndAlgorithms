import java.lang.reflect.Array;
import java.util.*;

class Main {
  public static int[] sortArrayOf012(int[] a) {
   int count0 = 0;
   int count1 = 0;
   int count2 = 0;
   for (int i = 0; i < a.length; i++) {
    if(a[i] == 0) count0 += 1;
    if(a[i] == 1) count1 += 1;
    if(a[i] == 2) count2 += 1;
   }
   for (int i = 0; i < count0; i++) {
    a[i] = 0;
   }
   for (int i = count0; i < count0+count1; i++) {
    a[i] = 1;
   }
   for (int i = count0+count1; i < count0+count1+count2; i++) {
    a[i] = 2;
   }
   return a;
  }


  public static void main(String[] args) {
    int[] arr = { 1, 2, 0,0,0,0, 1, 1, 1, 1 };
    System.out.println(Arrays.toString(sortArrayOf012(arr)));
  }
}
