import java.util.HashMap;
import java.util.Map;

/** Sliding-window solution. Time O(n) expected; space O(k). */
public class LongestUniqueSubstring {
    public static int lengthOfLongestSubstring(String text) {
        Map<Character, Integer> lastSeen = new HashMap<>();
        int left = 0, best = 0;
        for (int right = 0; right < text.length(); right++) {
            char c = text.charAt(right);
            if (lastSeen.containsKey(c) && lastSeen.get(c) >= left) left = lastSeen.get(c) + 1;
            lastSeen.put(c, right);
            best = Math.max(best, right - left + 1);
        }
        return best;
    }

    public static void main(String[] args) {
        if (lengthOfLongestSubstring("abcabcbb") != 3) throw new AssertionError("Example failed");
        if (lengthOfLongestSubstring("bbbbb") != 1) throw new AssertionError("Repeated characters test failed");
        if (lengthOfLongestSubstring("") != 0) throw new AssertionError("Empty string test failed");
        if (lengthOfLongestSubstring("pwwkew") != 3) throw new AssertionError("Window shift test failed");
        System.out.println("All Longest Unique Substring examples passed.");
    }
}
