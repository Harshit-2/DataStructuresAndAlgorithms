import java.util.*;

class Main {
  public static Set<List<Integer>> fourSum(int[] arr, int target) {
    HashSet<List<Integer>> set = new HashSet<>();
    for(int i = 0; i < arr.length; i++) {
      for (int j = i+1; j < arr.length; j++) {
        for (int k = j+1; k < arr.length; k++) {
          for (int l = k+1; l < arr.length; l++) {
            long sum = arr[i] + arr[j];
            sum += arr[k];
            sum += arr[l];
            if(sum == target) {
              List<Integer> qurds = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
              qurds.sort(null);
              set.add(qurds);
            }
          }
        }
      }
    }
   return set;
  }

  public static void main(String[] args) {
    int[] arr = { -1, 0, 1, 2, -1, -4 };
    System.out.println(fourSum(arr, 0));
  }
}
