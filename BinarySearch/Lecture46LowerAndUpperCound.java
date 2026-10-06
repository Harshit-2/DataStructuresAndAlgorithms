package BinarySearch;

public class Lecture46LowerAndUpperCound {

    public static int lowerBound(int[] arr, int x) {
        int ans = arr.length;
        int low = 0;
        int high = arr.length-1;
        while (low<=high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= x) {
                ans = mid;
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return ans;
    }

    public static int upperBound(int[] arr, int x) {
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > x) {
                ans = mid;
                high = mid-1;
            } 
            else low = mid+1;
        }
        return ans;
    }

    public static int searchInsert(int [] arr, int m) {
        int low = 0;
        int ans = arr.length;
        int high = arr.length-1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= m) {
                ans = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        return ans;
    }

    public static int floor(int[] arr, int num) {
        int low = 0; 
        int ans = -1;
        int high = arr.length-1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= num) {
                ans = mid;
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return ans;
    }

    public static int ceil(int[] arr, int num) {
        int low = 0; 
        int ans = -1;
        int high = arr.length-1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= num) {
                ans = mid;
                high = mid -1;
            }
            else low = mid + 1;
        }
        return ans;
    }
    
    public static void main(String[] args) {
    int[] arr = { 1,2,3,3,5,8,8,10,10,11 };
    System.out.println(lowerBound(arr, 10));
    System.out.println(upperBound(arr, 6));
    System.out.println(searchInsert(arr, 6));
    System.out.println(floor(arr, 6));
    System.out.println(ceil(arr, 6));
  }
}
