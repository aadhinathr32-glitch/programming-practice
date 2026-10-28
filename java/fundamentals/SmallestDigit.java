import java.util.Scanner;

/**
 * Finds the smallest digit in an integer.
 */
public class SmallestDigit {
    public static int smallestDigit(int number) {
        long remaining = Math.abs((long) number);

        if (remaining == 0) {
            return 0;
        }

        int smallest = (int) (remaining % 10);

        while (remaining > 0) {
            int digit = (int) (remaining % 10);
            if (digit <= smallest) {
                smallest = digit;
            }
            remaining = remaining / 10;
        }

        return smallest;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int number = scanner.nextInt();
            System.out.println(smallestDigit(number));
        }
    }
}
