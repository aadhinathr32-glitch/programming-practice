import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = scanner.nextInt();

        long factorial = 1;

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers");
        } else {
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }

            System.out.println("Factorial: " + factorial);
        }

        scanner.close();
    }
}
