import java.util.HashMap;
import java.util.Map;

/** Character-frequency solution. Time O(n + m); space O(k). */
public class ValidAnagram {
    public static boolean isAnagram(String first, String second) {
        if (first.length() != second.length()) return false;
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : first.toCharArray()) counts.put(c, counts.getOrDefault(c, 0) + 1);
        for (char c : second.toCharArray()) {
            int count = counts.getOrDefault(c, 0);
            if (count == 0) return false;
            if (count == 1) counts.remove(c);
            else counts.put(c, count - 1);
        }
        return counts.isEmpty();
    }

    public static void main(String[] args) {
        if (!isAnagram("listen", "silent")) throw new AssertionError("Example failed");
        if (!isAnagram("aabb", "baba")) throw new AssertionError("Duplicate test failed");
        if (isAnagram("hello", "world")) throw new AssertionError("Different strings test failed");
        if (!isAnagram("", "")) throw new AssertionError("Empty strings test failed");
        System.out.println("All Valid Anagram examples passed.");
    }
}
