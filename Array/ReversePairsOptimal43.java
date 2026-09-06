import java.util.*;

class Main {

    public static void merge(int[] arr, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = 0;

        int[] res = new int[high - low + 1];

        while (i <= mid && j <= high) {
            if(arr[i] < arr[j]) res[k++] = arr[i++];
            else res[k++] = arr[j++];
        }

        while (i <= mid) {
            res[k++] = arr[i++];
        }

        while (j <= high) {
            res[k++] = arr[j++];
        }
        for (int p = 0; p < res.length; p++) {
            arr[low+p] = res[p];
        }
    }

    public static int reversePair(int arr[], int low, int high) {
        int cnt = 0;
        if(low < high) {
            int mid = (low + high) / 2;
            cnt += reversePair(arr, low, mid);
            cnt += reversePair(arr, mid + 1, high);
            cnt += countPairs(arr, low, mid, high);
            merge(arr, low, mid, high);
        }
        return cnt;
    }

    public static int countPairs(int[] arr, int low, int mid, int high) {
        int right = mid + 1;
        int cnt = 0;
        for (int i = low; i <= mid; i++) {
            while (right <= high && arr[i] > 2 * arr[right]) {
                right++;
            }
            cnt += (right - (mid + 1));
        }
        return cnt;
    }

    public static void main(String[] args) {

        int[] arr = { 40, 25, 19, 12, 9, 6, 2 };
        System.out.println(reversePair(arr, 0, 6));
    }
}
