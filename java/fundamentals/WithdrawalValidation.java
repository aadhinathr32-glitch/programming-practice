import java.util.Scanner;

/**
 * Validates a withdrawal against the account balance.
 */
public class WithdrawalValidation {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter account balance: ");
            int accountBalance = scanner.nextInt();

            System.out.print("Enter withdrawal amount: ");
            int withdrawalAmount = scanner.nextInt();

            if (withdrawalAmount <= 0) {
                System.out.println("Transaction rejected");
            } else {
                if (withdrawalAmount <= accountBalance) {
                    System.out.println("Withdrawal successful");
                } else {
                    System.out.println("Insufficient balance");
                }
            }
        }
    }
}
