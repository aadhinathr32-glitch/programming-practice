import java.util.Scanner;
import java.util.Locale;

public class CustomerCategoryCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your monthly electricity consumption in units: ");
        double consumption = scanner.nextDouble();

        System.out.print("Are you a senior citizen (yes/no): ");
        String customer = scanner.next();

        String lowercaseCustomer = customer.toLowerCase(Locale.ROOT);

        if (consumption < 0) {
            System.out.println("Invalid consumption");
        } else if (consumption > 500) {
            System.out.println("High consumption");
        } else if (lowercaseCustomer.equals("yes") || age < 18) {
            System.out.println("Special category");
        } else {
            System.out.println("Regular customer");
        }

        scanner.close();
    }
}
