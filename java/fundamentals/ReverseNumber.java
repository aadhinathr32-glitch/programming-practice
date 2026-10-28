import java.util.Scanner;

/**
 * Reverses an integer while preserving its sign.
 */
public class ReverseNumber {
    public static int reverseInteger(int number) {
        boolean isNegative = number < 0;

        // Use long so Math.abs handles Integer.MIN_VALUE safely.
        long remaining = Math.abs((long) number);
        long reversed = 0;

        while (remaining > 0) {
            long digit = remaining % 10;
            reversed = reversed * 10 + digit;
            remaining /= 10;
        }

        if (isNegative) {
            reversed = -reversed;
        }

        // Keep the return type int; reject values outside its range.
        if (reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE) {
            throw new ArithmeticException("Reversed number is outside the int range.");
        }

        return (int) reversed;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(reverseInteger(number));
        }
    }
}
