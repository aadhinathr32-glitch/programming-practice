import java.util.Scanner;
import java.util.Locale;

public class PurchaseDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        int amount = scanner.nextInt();

        System.out.print("Enter customer type: ");
        String customerType = scanner.next();
        customerType = customerType.toLowerCase(Locale.ROOT);

        if (amount < 0) {
            System.out.println("Invalid amount");
        } else if (amount == 0) {
            System.out.println("No purchase");
        } else {
            int discount = 0;

            if (customerType.equals("regular")) {
                discount = 5;
            } else if (customerType.equals("premium")) {
                discount = 10;
            } else if (customerType.equals("vip")) {
                discount = 20;
            } else {
                System.out.println("Invalid input");
            }

            if (discount != 0) {
                double discountAmount = amount * discount / 100.0;
                double finalAmount = amount - discountAmount;

                System.out.println("Discount: " + discount + "%");
                System.out.println("Discount amount: " + discountAmount);
                System.out.println("Final amount: " + finalAmount);
            }
        }

        scanner.close();
    }
}
