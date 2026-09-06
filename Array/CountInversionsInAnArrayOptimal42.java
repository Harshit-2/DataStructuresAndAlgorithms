import java.util.*;

class Main {

    public static int merge(int[] arr, int low, int mid, int high) {

        int[] res = new int[high - low + 1];

        int cnt = 0;
        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                res[k] = arr[i];
                i++;
                k++;
            } else {
                res[k] = arr[j];
                cnt += (mid - i) + 1;
                j++;
                k++;
            }
        }

        while (i <= mid) {
            res[k] = arr[i];
            i++;
            k++;
        }

        while (j <= high) {
            res[k] = arr[j];
            j++;
            k++;
        }

        for (int p = 0; p < res.length; p++) {
            arr[low + p] = res[p];
        }
        return cnt;
    }

    public static int countInversions(int[] arr, int low, int high) {

        int cnt = 0;
        if (low < high) {
            int mid = (low + high) / 2;

            cnt += countInversions(arr, low, mid);
            cnt += countInversions(arr, mid + 1, high);
            cnt += merge(arr, low, mid, high);
        }
        return cnt;
    }

    public static void main(String[] args) {

    int[] arr = {5, 3, 2, 4, 1};
    int inversions = countInversions(arr, 0, arr.length);
    System.out.println(inversions);
}
}
