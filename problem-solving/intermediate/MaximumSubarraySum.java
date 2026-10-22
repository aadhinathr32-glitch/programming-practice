/** Kadane's algorithm for the maximum non-empty contiguous subarray sum. O(n) time, O(1) space. */
public class MaximumSubarraySum {
    public static int maxSubarraySum(int[] values) {
        if (values.length == 0) throw new IllegalArgumentException("values must not be empty");
        int current = values[0], best = values[0];
        for (int i = 1; i < values.length; i++) {
            current = Math.max(values[i], current + values[i]);
            best = Math.max(best, current);
        }
        return best;
    }

    public static void main(String[] args) {
        if (maxSubarraySum(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}) != 6) throw new AssertionError("Example failed");
        if (maxSubarraySum(new int[] {-5, -2, -8}) != -2) throw new AssertionError("All-negative test failed");
        if (maxSubarraySum(new int[] {3}) != 3) throw new AssertionError("Single value test failed");
        System.out.println("All Maximum Subarray Sum examples passed.");
    }
}
