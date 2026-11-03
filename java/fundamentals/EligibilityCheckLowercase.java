import java.util.Scanner;

/**
 * Checks eligibility using age, degree, and experience.
 */
public class EligibilityCheckLowercase {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            System.out.print("Do you have a degree? (yes/no) ");
            String degree = scanner.next();
            String degreeLower = degree.toLowerCase();

            System.out.print("Enter experience: ");
            int experience = scanner.nextInt();

            if (((age >= 21) && (degreeLower.equals("yes"))) || (experience >= 3)) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not eligible");
            }
        }
    }
}
