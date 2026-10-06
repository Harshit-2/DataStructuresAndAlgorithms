package BinarySearch;

public class Lesson45BinarySearchRecusion {
    public static int binarySearch(int[] nums, int low, int high, int target) {
        if (high < low) return -1;

        int mid = low + (high - low) / 2;
        if(nums[mid] == target) return mid;
        else if(target < nums[mid]) return binarySearch(nums, low, mid-1,target);
        else return binarySearch(nums, mid+1, high, target);
    }


    public static int main(int []nums, int target) {
        // Write your code here.
    return binarySearch(nums, 0, nums.length-1, target);
    }
}
