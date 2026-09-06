import java.util.*;

class Main {
  public static List<List<Integer>> threeSum(int[] arr) {
   List<List<Integer>> list = new ArrayList<>();
   for(int i = 0; i < arr.length; i++) {
    if(i > 0 && arr[i] == arr[i-1]) continue;
    int j = i+1;
    int k = arr.length-1;
    Arrays.sort(arr);
    while(j < k) {
      int sum = arr[i] + arr[j] + arr[k];
      if(sum < 0) {
        j++;
      }
      else if(sum > 0) {
        k--;
      }
      else {
        List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[k]);
        list.add(triplet);
        j++;
        k--;
        while(j < k && arr[j] == arr[j-1]) j++;
        while(j < k && arr[k] == arr[k+1]) k--;
      }
    }
   }
   return list;
  }

  public static void main(String[] args) {
    int[] arr = { -1, 0, 1, 2, -1, -4 };
    System.out.println(threeSum(arr));
  }
}
