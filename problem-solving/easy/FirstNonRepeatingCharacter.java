import java.util.LinkedHashMap;
import java.util.Map;

/** Counts characters while preserving insertion order. Time O(n); space O(k). */
public class FirstNonRepeatingCharacter {
    public static Character firstNonRepeating(String text) {
        Map<Character, Integer> counts = new LinkedHashMap<>();
        for (char c : text.toCharArray()) counts.put(c, counts.getOrDefault(c, 0) + 1);
        for (char c : text.toCharArray()) if (counts.get(c) == 1) return c;
        return null;
    }

    public static void main(String[] args) {
        if (!Character.valueOf('w').equals(firstNonRepeating("swiss"))) throw new AssertionError("Example failed");
        if (firstNonRepeating("aabb") != null) throw new AssertionError("No unique character test failed");
        if (!Character.valueOf('x').equals(firstNonRepeating("x"))) throw new AssertionError("Single character test failed");
        if (firstNonRepeating("") != null) throw new AssertionError("Empty string test failed");
        System.out.println("All First Non-Repeating Character examples passed.");
    }
}
