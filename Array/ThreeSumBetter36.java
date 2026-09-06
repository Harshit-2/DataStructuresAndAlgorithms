import java.util.*;

class Main {
  public static Set<List<Integer>> threeSum(int[] arr) {

    List<List<Integer>> list = new ArrayList<>();
    HashSet<List<Integer>> hash = new HashSet<>();
    for(int i = 0; i < arr.length; i++) {
      HashSet<Integer> set = new HashSet<>();
      for (int j = i+1; j < arr.length; j++) {
        int num = - (arr[i] + arr[j]);
        if(set.contains(num)) {
          List triplets = Arrays.asList(arr[i], arr[j], num);
          triplets.sort(null);
          hash.add(triplets);
          
        } else {
          set.add(arr[j]);
        }
      }
    }
    return hash;
  }

  public static void main(String[] args) {
    int[] arr = { -1, 0, 1, 2, -1, -4 };
    System.out.println(threeSum(arr));
  }
}
