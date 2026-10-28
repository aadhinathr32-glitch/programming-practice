import java.util.Scanner;

/**
 * Finds the largest digit in an integer.
 */
public class LargestDigit {
    public static int largestDigit(int number) {
        long remaining = Math.abs((long) number);
        int largest = 0;

        while (remaining > 0) {
            int digit = (int) (remaining % 10);
            if (digit > largest) {
                largest = digit;
            }
            remaining = remaining / 10;
        }

        return largest;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int number = scanner.nextInt();
            System.out.println(largestDigit(number));
        }
    }
}
