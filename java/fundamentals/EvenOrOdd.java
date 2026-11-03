import java.util.Scanner;

/**
 * Checks whether an integer is even or odd.
 */
public class EvenOrOdd {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                System.out.println("The given number is even");
            } else {
                System.out.println("The given number is odd");
            }
        }
    }
}
