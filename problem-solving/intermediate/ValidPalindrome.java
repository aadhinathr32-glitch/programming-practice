/** Two-pointer palindrome check, ignoring non-alphanumeric characters and case. O(n) time, O(1) space. */
public class ValidPalindrome {
    public static boolean isValidPalindrome(String text) {
        int left = 0, right = text.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(text.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(text.charAt(right))) right--;
            if (Character.toLowerCase(text.charAt(left)) != Character.toLowerCase(text.charAt(right))) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        if (!isValidPalindrome("A man, a plan, a canal: Panama")) throw new AssertionError("Phrase test failed");
        if (!isValidPalindrome("")) throw new AssertionError("Empty input test failed");
        if (isValidPalindrome("race a car")) throw new AssertionError("Non-palindrome test failed");
        System.out.println("All Valid Palindrome examples passed.");
    }
}
