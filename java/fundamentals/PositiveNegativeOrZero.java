import java.util.Scanner;

/**
 * Determines whether an integer is positive, negative, or zero.
 */
public class PositiveNegativeOrZero {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int num = scanner.nextInt();

            if (num > 0) {
                System.out.println("Positive number");
            } else if (num == 0) {
                System.out.println("Zero");
            } else {
                System.out.println("Negative number");
            }
        }
    }
}
