import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Enter a non-negative number");
        } else if (number == 0) {
            System.out.println("Binary: 0");
        } else {
            int num = number;
            String binary = "";

            while (num > 0) {
                int remainder = num % 2;
                binary = remainder + binary;
                num /= 2;
            }

            System.out.println("Binary: " + binary);
        }

        scanner.close();
    }
}
