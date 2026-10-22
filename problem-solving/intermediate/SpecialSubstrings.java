import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Selects up to k disjoint special substrings, excluding the entire string. */
public class SpecialSubstrings {
    private static final class Interval {
        final int start, end;
        Interval(int start, int end) { this.start = start; this.end = end; }
    }

    public static boolean canSelect(String text, int k) {
        if (k <= 0) return true;
        int n = text.length();
        if (n == 0) return false;

        Map<Character, Integer> first = new HashMap<>();
        Map<Character, Integer> last = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            first.putIfAbsent(c, i);
            last.put(c, i);
        }

        List<Interval> candidates = new ArrayList<>();
        for (char c : first.keySet()) {
            int start = first.get(c);
            int end = last.get(c);
            boolean valid = true;
            for (int i = start; i <= end; i++) {
                char current = text.charAt(i);
                if (first.get(current) < start) {
                    valid = false;
                    break;
                }
                end = Math.max(end, last.get(current));
            }
            if (valid && !(start == 0 && end == n - 1)) candidates.add(new Interval(start, end));
        }

        candidates.sort(Comparator.comparingInt((Interval interval) -> interval.end)
                                  .thenComparingInt(interval -> interval.start));
        int count = 0, previousEnd = -1;
        for (Interval interval : candidates) {
            if (interval.start > previousEnd) {
                count++;
                previousEnd = interval.end;
                if (count >= k) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        if (!canSelect("abc", 2)) throw new AssertionError("Independent characters test failed");
        if (!canSelect("abc", 3)) throw new AssertionError("Three candidates test failed");
        if (canSelect("abc", 4)) throw new AssertionError("Too many candidates test failed");
        if (!canSelect("abb", 1)) throw new AssertionError("Special substring test failed");
        if (!canSelect("abc", 0)) throw new AssertionError("Zero requested test failed");
        System.out.println("All Special Substrings examples passed.");
    }
}
