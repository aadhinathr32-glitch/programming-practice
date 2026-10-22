import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/** Sorts and merges overlapping intervals. Time O(n log n); result space O(n). */
public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][];
        int[][] ordered = Arrays.stream(intervals)
            .map(int[]::clone)
            .sorted(Comparator.comparingInt(interval -> interval[0]))
            .toArray(int[][]::new);
        List<int[]> merged = new ArrayList<>();
        for (int[] interval : ordered) {
            if (merged.isEmpty() || interval[0] > merged.get(merged.size() - 1)[1]) {
                merged.add(interval);
            } else {
                int[] last = merged.get(merged.size() - 1);
                last[1] = Math.max(last[1], interval[1]);
            }
        }
        return merged.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] actual = merge(new int[][] {{1, 3}, {2, 6}, {8, 10}, {15, 18}});
        int[][] expected = {{1, 6}, {8, 10}, {15, 18}};
        if (!Arrays.deepEquals(actual, expected)) throw new AssertionError("Example failed");
        if (!Arrays.deepEquals(merge(new int[][] {}), new int[0][])) throw new AssertionError("Empty input test failed");
        if (!Arrays.deepEquals(merge(new int[][] {{1, 4}, {4, 5}}), new int[][] {{1, 5}})) throw new AssertionError("Touching intervals test failed");
        System.out.println("All Merge Intervals examples passed.");
    }
}
