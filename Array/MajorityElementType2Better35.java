import java.util.*;

class Main {
  public static List<Integer> MajorityElementType2(int[] arr) {
    List<Integer> list = new ArrayList<>();
    Map<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < arr.length; i++) {
        map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        if(map.get(arr[i]) > arr.length / 3) list.add(arr[i]);
      
    }
    return list;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 1, 1, 3, 3, 2, 2, 2 };
    System.out.println(MajorityElementType2(arr));
  }
}
