import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

/** Checks bracket nesting. Time O(n); space O(n). */
public class ValidParentheses {
    public static boolean isValid(String text) {
        Map<Character, Character> pairs = Map.of(')', '(', ']', '[', '}', '{');
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : text.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') stack.push(c);
            else if (pairs.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != pairs.get(c)) return false;
            } else return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        if (!isValid("([]{})")) throw new AssertionError("Nested brackets test failed");
        if (!isValid("")) throw new AssertionError("Empty input test failed");
        if (isValid("(]")) throw new AssertionError("Mismatched brackets test failed");
        if (isValid("(((")) throw new AssertionError("Unclosed brackets test failed");
        System.out.println("All Valid Parentheses examples passed.");
    }
}
