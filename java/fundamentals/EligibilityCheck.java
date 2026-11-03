import java.util.Scanner;

/**
 * Checks eligibility using combined AND and OR conditions.
 */
public class EligibilityCheck {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter age: ");
            int age = scanner.nextInt();

            System.out.print("Do you have a degree? ");
            String degree = scanner.next().trim().toLowerCase();

            System.out.print("Enter experience: ");
            int experience = scanner.nextInt();

            if ((age >= 21 && degree.equals("yes")) || experience >= 3) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not eligible");
            }
        }
    }
}
