import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

/**
 * Return indices of two values whose sum equals the target.
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int index = 0; index < nums.length; index++) {
            int complement = target - nums[index];
            if (seen.containsKey(complement)) {
                return new int[] { seen.get(complement), index };
            }
            seen.put(nums[index], index);
        }

        return new int[0];
    }

    public static void main(String[] args) {
        if (!Arrays.equals(twoSum(new int[] {2, 7, 11, 15}, 9), new int[] {0, 1})) {
            throw new AssertionError("Example 1 failed");
        }
        if (!Arrays.equals(twoSum(new int[] {3, 2, 4}, 6), new int[] {1, 2})) {
            throw new AssertionError("Example 2 failed");
        }
        if (!Arrays.equals(twoSum(new int[] {3, 3}, 6), new int[] {0, 1})) {
            throw new AssertionError("Duplicate values test failed");
        }
        if (!Arrays.equals(twoSum(new int[] {1, 2, 3}, 7), new int[0])) {
            throw new AssertionError("No solution test failed");
        }

        System.out.println("All Two Sum examples passed.");
    }
}
