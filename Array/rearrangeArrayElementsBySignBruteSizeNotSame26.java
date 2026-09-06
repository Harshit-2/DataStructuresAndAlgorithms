import java.lang.reflect.Array;
import java.util.*;

class Main {
  public static int[] rearrangeArrayElementsBySign(int[] arr) {
    List <Integer> pos = new ArrayList<>();
    List <Integer> neg = new ArrayList<>();
   
    int posCounter = 0;
    int negCounter = 0;
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] > 0) pos.add(arr[i]);
      else neg.add(arr[i]);
    }

    int i = 0;
    int less = Math.min(pos.size(), neg.size());

    while( i < (less * 2)) {
      if(i % 2 == 0) {
        arr[i] = pos.get(posCounter);
        posCounter++;
        i++;
      } else {
        arr[i] = neg.get(negCounter);
        negCounter++;
        i++;
      }
    }

    for (int j = less*2; j < arr.length; j++) {
      if ((pos.size() - neg.size()) > 0) {
        arr[j] = pos.get(posCounter);
        posCounter++;
      }
      else {
        arr[j] = neg.get(negCounter);
        negCounter++;
      }
    }
   return arr;
  }


  public static void main(String[] args) {
    int[] arr = { 1, 2, -6, -7, 3, 5 };
    System.out.println(Arrays.toString(rearrangeArrayElementsBySign(arr)));
  }
}
