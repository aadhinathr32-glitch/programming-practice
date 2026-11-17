import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int num = Math.abs(number);

        if (num <= 1) {
            System.out.println("No prime factors");
        } else {
            int factor = 2;

            while (factor <= num) {
                if (num % factor == 0) {
                    System.out.print(factor + " ");

                    while (num % factor == 0) {
                        num /= factor;
                    }
                }

                factor++;
            }

            System.out.println();
        }

        scanner.close();
    }
}
