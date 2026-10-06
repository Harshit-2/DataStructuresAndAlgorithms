package BinarySearch;

public class Lesson45BinarySearch {
    public static int search(int []nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(target == nums[mid]) return mid;
            else if (target < nums[mid]) high = mid-1;
            else low = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
    int[] arr = { 0,1,3,6,8,9,10 };
    System.out.println(search(arr, 6));
}

}
