import java.util.Scanner;

/**
 * Finds the smallest among three numbers.
 */
public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int n1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int n2 = scanner.nextInt();

            System.out.print("Enter third number: ");
            int n3 = scanner.nextInt();

            if ((n1 <= n2) && (n1 <= n3)) {
                System.out.println("First number is the smallest");
            } else if ((n2 <= n1) && (n2 <= n3)) {
                System.out.println("Second number is the smallest");
            } else {
                System.out.println("Third number is the smallest");
            }
        }
    }
}
