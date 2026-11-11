import java.util.Scanner;

public class CountDigitsUsingWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int num = Math.abs(number);
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }

        System.out.println(count);

        scanner.close();
    }
}
