import java.util.HashMap;

class Main {
    public static int countSubarraySumEqualsK(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0;
        int preSum = 0;

        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];
            int requiredPreSum = preSum - target;
            int occurrences = map.getOrDefault(requiredPreSum, 0);

            count = count + occurrences;
            int currFreq = map.getOrDefault(preSum, 0);

            map.put(preSum, currFreq + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        int answer = countSubarraySumEqualsK(arr, 3);
        System.out.println(answer);
    }
}
