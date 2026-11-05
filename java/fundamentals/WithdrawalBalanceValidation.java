import java.util.Scanner;

public class WithdrawalBalanceValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your current account balance: ");
        int accountBalance = scanner.nextInt();

        System.out.print("Enter withdrawal amount: ");
        int withdrawalAmount = scanner.nextInt();

        if (accountBalance < 0) {
            System.out.println("Invalid balance");
        } else if (withdrawalAmount < 0) {
            System.out.println("Invalid withdrawal");
        } else if (withdrawalAmount == 0) {
            System.out.println("No withdrawal");
        } else {
            if (withdrawalAmount > accountBalance) {
                System.out.println("Insufficient balance");
            } else {
                int balance = accountBalance - withdrawalAmount;
                System.out.println("Withdrawal amount: " + withdrawalAmount);
                System.out.println("Remaining balance: " + balance);
            }
        }

        scanner.close();
    }
}
