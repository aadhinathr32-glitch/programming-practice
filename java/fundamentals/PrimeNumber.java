import java.util.Scanner;

/**
 * Checks whether an integer is prime.
 */
public class PrimeNumber {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        int i = 2;
        while (i < number) {
            if (number % i == 0) {
                return false;
            }
            i = i + 1;
        }

        return true;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (isPrime(number)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }
}
