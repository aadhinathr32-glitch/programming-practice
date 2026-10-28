import java.util.Scanner;

/**
 * Checks whether a non-negative integer is a palindrome.
 */
public class PalindromeNumber {
    public static boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }

        int original = number;
        long reverse = 0;
        long remaining = number;

        while (remaining > 0) {
            long digit = remaining % 10;
            reverse = reverse * 10 + digit;
            remaining = remaining / 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (isPalindrome(number)) {
                System.out.println("palindrome");
            } else {
                System.out.println("not palindrome");
            }
        }
    }
}
