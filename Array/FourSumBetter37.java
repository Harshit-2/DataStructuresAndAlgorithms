import java.util.*;

class Main {
  public static Set<List<Integer>> fourSum(int[] arr, int target) {
    HashSet<List<Integer>> set = new HashSet<>();

    for(int i = 0; i < arr.length; i++) {
      for (int j = i+1; j < arr.length; j++) {
        HashSet<Integer> hash = new HashSet<>();
        for (int k = j+1; k < arr.length; k++) {
          long num = (long)target - (arr[i] + arr[j] + arr[k]);
          if(hash.contains((int)num)) {
            List<Integer> quads = Arrays.asList(arr[i], arr[j], arr[k], (int)num);
            quads.sort(null);
            set.add(quads);
          } else {
            hash.add(arr[k]);
          }
        }
      }
    }
   return set;
  }

  public static void main(String[] args) {
    int[] arr = { -1, 0, 1, 2, -1, -4, 1, 0, 0, 0, 0 };
    System.out.println(fourSum(arr, 0));
  }
}

