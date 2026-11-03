import java.util.Scanner;

/**
 * Determines acceptance using a logical OR condition.
 */
public class AcceptOrReject {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter number 1: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter number 2: ");
            int num2 = scanner.nextInt();

            if (num1 > 100 || num2 < 50) {
                System.out.println("Accepted");
            } else {
                System.out.println("Rejected");
            }
        }
    }
}
