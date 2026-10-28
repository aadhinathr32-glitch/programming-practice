import java.util.Scanner;

/**
 * Counts even and odd digits in an integer.
 */
public class CountEvenOddDigits {
    public static int[] countEvenOddDigits(int number) {
        long remaining = Math.abs((long) number);
        int evenCount = 0;
        int oddCount = 0;

        if (remaining == 0) {
            evenCount++;
        } else {
            while (remaining > 0) {
                long digit = remaining % 10;

                if (digit % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }

                remaining = remaining / 10;
            }
        }

        return new int[] {evenCount, oddCount};
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            int[] counts = countEvenOddDigits(number);
            System.out.println("The count of even numbers are: " + counts[0]);
            System.out.println("The count of odd numbers are: " + counts[1]);
        }
    }
}
