import java.util.*;

class Main {
  public static List<Integer> MajorityElementType2(int[] arr) {
    List<Integer> list = new ArrayList<>();
    int ele1 = Integer.MIN_VALUE;
    int ele2 = Integer.MIN_VALUE;
    int count1 = 0;
    int count2= 0;
    for(int i = 0; i < arr.length; i++) {
      if (count1 == 0 && ele2 != arr[i]) {
        ele1 = arr[i];
        count1 += 1;
      }
      else if (count2 == 0 && ele1 != arr[i]) {
        ele2 = arr[i];
        count2 += 1;
      } 
      else if (arr[i] == ele1) {
        count1 += 1;
      }
      else if (arr[i] == ele2) {
        count2 += 1;
      }
      else {
        count1 -= 1;
        count2 -= 1;
      }
    }
    count1 = 0;
    count2 = 0;
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] == ele1) count1 +=1;
      if(arr[i] == ele2) count2 +=1;
    }
    if(count1 > arr.length/3)
      list.add(ele1);
    if(count2 > arr.length/3)
      list.add(ele2);

    return list;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 1, 1, 3, 3, 2, 2, 2 };
    System.out.println(MajorityElementType2(arr));
  }
}
