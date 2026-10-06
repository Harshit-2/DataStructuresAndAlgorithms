// package BinarySearch;

// import java.util.ArrayList;
// import java.util.List;

// public class Lesson47FirstAndLastOccurance {

//     public static int first(ArrayList<Integer> arr, int target) {
//         int low = 0;
//         int high = arr.size()-1;
//         int ans = -1;
//         while (low <= high) {
//             int mid =  low + (high - low) / 2;
//             if(arr.get(mid)>= target) {
//                 ans = mid;
//                 high = mid-1;
//             } 
//             else low = mid+1;
//         }
//         return ans;
//     }

//     public static int last(ArrayList<Integer> arr, int target) {
//         int low = 0; 
//         int high = arr.size()-1;
//         int ans = arr.size();
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if(arr.get(mid) > target) {
//                 ans = mid;
//                 high = mid - 1;
//             } 
//             else low = mid + 1;
//         }
//         if (ans != -1) return ans - 1;
//         else return first(arr, target);
//     }
//     public static void main(String[] args) {
//     ArrayList<Integer> arr = new ArrayList<>(List.of(1,2,3,4,5,6,6,8,8,8,9,10)) ;
//     System.out.println(first(arr, 811));
//     System.out.println(last(arr, 811));
//     }
// }
