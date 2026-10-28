import java.util.Scanner;

/**
 * Calculates the sum of the digits in an integer.
 */
public class SumOfDigits {
    public static int sumOfDigits(int number) {
        long remaining = Math.abs((long) number);
        int total = 0;

        while (remaining > 0) {
            long digit = remaining % 10;
            total += digit;
            remaining = remaining / 10;
        }

        return total;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(sumOfDigits(number));
        }
    }
}
