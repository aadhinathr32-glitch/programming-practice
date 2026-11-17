import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int num = Math.abs(number);
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            int factorial = 1;

            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }

            sum += factorial;
            num /= 10;
        }

        if (sum == original) {
            System.out.println("Strong number");
        } else {
            System.out.println("Not a strong number");
        }

        scanner.close();
    }
}
