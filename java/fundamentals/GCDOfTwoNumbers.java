import java.util.Scanner;

public class GCDOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = Math.abs(scanner.nextInt());

        System.out.print("Enter second number: ");
        int num2 = Math.abs(scanner.nextInt());

        while (num2 != 0) {
            int remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }

        System.out.println("GCD: " + num1);

        scanner.close();
    }
}
