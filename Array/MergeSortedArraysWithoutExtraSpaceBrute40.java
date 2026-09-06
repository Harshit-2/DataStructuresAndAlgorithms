import java.lang.reflect.Array;
import java.util.*;

class Main {
  public static void mergeSortedArrays(long[] arr1, long[] arr2) {
    int i = 0;
    int j = 0;
    int k = 0;

    long[] result = new long[arr1.length + arr2.length];
    while(i < arr1.length && j < arr2.length) {
        if(arr1[i] <= arr2[j]) {
            result[k] = arr1[i];
            i++;
            k++;
        } else {
            result[k] = arr2[j];
            j++;
            k++;
        }
    }
    while (i < arr1.length) {
        result[k] = arr1[i];
        i++;
        k++;
    }
    while (j < arr2.length) {
        result[k] = arr2[j];
        j++;
        k++;
    }
    for (int l = 0; l < result.length; l++) {
        if(l < arr1.length) {
            arr1[l] = result[l];
        } else {
            arr2[l-arr1.length] = result[l];
        }
    }
    for (int l = 0; l < arr1.length; l++) {
        System.out.println("arr1: " + arr1[l]);
    }
    for (int l = 0; l < arr2.length; l++) {
        System.out.println("arr2: " + arr2[l]);
    }
  }

  public static void main(String[] args) {
    long[] arr1 = { 1, 3, 5, 7 };
    long[] arr2 = { 0, 2, 6, 8, 9 };
    mergeSortedArrays(arr1, arr2);
  }
}
