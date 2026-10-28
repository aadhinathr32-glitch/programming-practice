import java.util.Scanner;

/**
 * Counts the digits in an integer.
 */
public class CountDigits {
    public static int countDigits(int number) {
        long remaining = Math.abs((long) number);

        if (remaining == 0) {
            return 1;
        }

        int count = 0;
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
            System.out.println("Count = " + countDigits(number));
        }
    }
}
