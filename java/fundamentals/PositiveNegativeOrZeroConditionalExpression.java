import java.util.Scanner;

/**
 * Determines whether an integer is positive, negative, or zero.
 */
public class PositiveNegativeOrZeroConditionalExpression {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            if (num == 0) {
                System.out.println("Zero");
            } else {
                String result = (num > 0) ? "Positive" : "negative";
                System.out.println(result);
            }
        }
    }
}
