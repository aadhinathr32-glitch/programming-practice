import java.util.Scanner;

/**
 * Checks whether a number is greater than 100.
 */
public class NumberGreaterThan100 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            if (num > 100) {
                System.out.println("Number is greater than 100");
            }

            System.out.println("program completed");
        }
    }
}
