import java.util.Scanner;

/**
 * Finds the largest among three numbers.
 */
public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int n1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int n2 = scanner.nextInt();

            System.out.print("Enter third number: ");
            int n3 = scanner.nextInt();

            if ((n1 >= n2) && (n1 >= n3)) {
                System.out.println("First number is the largest");
            } else if ((n2 >= n1) && (n2 >= n3)) {
                System.out.println("Second number is the largest");
            } else {
                System.out.println("Third number is the largest");
            }
        }
    }
}
