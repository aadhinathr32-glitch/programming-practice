import java.util.Scanner;

/**
 * Validates a withdrawal amount and its denomination.
 */
public class WithdrawalMultipleOf100 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter account balance: ");
            int accountBalance = scanner.nextInt();

            System.out.print("Enter withdrawal amount: ");
            int withdrawalAmount = scanner.nextInt();

            if (withdrawalAmount <= 0) {
                System.out.println("Transaction rejected");
            } else {
                if (accountBalance >= withdrawalAmount) {
                    if (withdrawalAmount % 100 == 0) {
                        System.out.println("Withdrawal successful");
                    } else {
                        System.out.println("Withdrawal failed");
                    }
                } else {
                    System.out.println("Insufficient balance");
                }
            }
        }
    }
}
