import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/** Removes duplicates while preserving first-occurrence order. Time O(n) expected; space O(n). */
public class RemoveDuplicates {
    public static List<Integer> removeDuplicates(int[] values) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (int value : values) if (seen.add(value)) result.add(value);
        return result;
    }

    public static void main(String[] args) {
        if (!removeDuplicates(new int[] {1, 2, 1, 3, 2}).equals(List.of(1, 2, 3))) throw new AssertionError("Example failed");
        if (!removeDuplicates(new int[] {}).equals(List.of())) throw new AssertionError("Empty input test failed");
        if (!removeDuplicates(new int[] {4, 4, 4}).equals(List.of(4))) throw new AssertionError("Repeated values test failed");
        if (!removeDuplicates(new int[] {1, 2, 3}).equals(List.of(1, 2, 3))) throw new AssertionError("Unique values test failed");
        System.out.println("All Remove Duplicates examples passed.");
    }
}
