  import java.lang.reflect.Array;
  import java.util.*;

  class Main {
    public static int[] rearrangeArrayElementsBySign(int[] arr) {
      List<Integer> pos = new ArrayList<>(); 
      List<Integer> neg = new ArrayList<>();
      int cp = 0;
      int cn = 0;
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] > 0) pos.add(arr[i]);
      else neg.add(arr[i]);
    }
    for (int i = 0; i < arr.length; i++) {
      if (i % 2 == 0) {
        arr[i] = pos.get(cp);
        cp++;
      } else {
        arr[i] = neg.get(cn);
        cn++;
      }
    }
    return arr;
  }


    public static void main(String[] args) {
      int[] arr = { 1, 2, -2, -4, -6, -7, 3, 5, 6, -1 };
      System.out.println(Arrays.toString(rearrangeArrayElementsBySign(arr)));
    }
  }

