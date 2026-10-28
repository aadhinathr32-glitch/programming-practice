import java.util.Scanner;

/**
 * Counts the digits in an integer using an absolute value.
 */
public class CountDigitsUsingAbsoluteValue {
    public static int countDigits(int number) {
        long remaining = Math.abs((long) number);
        int count = 0;

        if (remaining == 0) {
            return 1;
        }

        while (remaining > 0) {
            count = count + 1;
            remaining = remaining / 10;
        }

        return count;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println("Count is " + countDigits(number));
        }
    }
}
