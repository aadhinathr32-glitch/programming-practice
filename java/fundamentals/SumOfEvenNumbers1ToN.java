import java.util.Scanner;

public class SumOfEvenNumbers1ToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = scanner.nextInt();

        int sum = 0;

        for (int i = 2; i <= num; i += 2) {
            sum = sum + i;
        }

        System.out.println("Sum of even numbers: " + sum);

        scanner.close();
    }
}
