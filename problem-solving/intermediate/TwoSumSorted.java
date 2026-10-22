/** Two-pointer pair sum on a sorted array. Time O(n), auxiliary space O(1). */
public class TwoSumSorted {
    public static int[] twoSumSorted(int[] values, int target) {
        int left = 0, right = values.length - 1;
        while (left < right) {
            int total = values[left] + values[right];
            if (total == target) return new int[] {left, right};
            if (total < target) left++;
            else right--;
        }
        return new int[0];
    }

    public static void main(String[] args) {
        if (!java.util.Arrays.equals(twoSumSorted(new int[] {1, 2, 4, 6, 10}, 8), new int[] {1, 3})) throw new AssertionError("Example failed");
        if (!java.util.Arrays.equals(twoSumSorted(new int[] {1, 2, 3}, 10), new int[0])) throw new AssertionError("No pair test failed");
        if (!java.util.Arrays.equals(twoSumSorted(new int[] {}, 5), new int[0])) throw new AssertionError("Empty array test failed");
        System.out.println("All Sorted Two Sum examples passed.");
    }
}
