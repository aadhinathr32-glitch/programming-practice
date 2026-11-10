import java.util.Scanner;

public class LCMOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = Math.abs(scanner.nextInt());

        System.out.print("Enter second number: ");
        int num2 = Math.abs(scanner.nextInt());

        if (num1 == 0 || num2 == 0) {
            System.out.println("LCM: 0");
        } else {
            int a = num1;
            int b = num2;

            while (b != 0) {
                int remainder = a % b;
                a = b;
                b = remainder;
            }

            int gcd = a;
            int lcm = (num1 * num2) / gcd;

            System.out.println("LCM: " + lcm);
        }

        scanner.close();
    }
}
