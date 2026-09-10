public class Lesson184FrogJumpTabulationSpaceOptimized {
     public static int frogJump(int n, int[] height) {
        int prev = 0;
        int prev2 = 0;
        for (int i = 1; i < n; i++) {
            int jumpOne = prev + Math.abs(height[i] - height[i-1]);
            int jumpTwo = Integer.MAX_VALUE;
            if (i > 1) {
                jumpTwo = prev2 + Math.abs(height[i] - height[i-2]);
            }
            int curr = Math.min(jumpOne, jumpTwo);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }

    public static void main(String[] args) {
        int n = 6;
        int[] height = { 30, 10, 60, 10, 60, 50 };
        int[] dp = new int[n];
        System.out.println(frogJump(n, height));
    }
}
