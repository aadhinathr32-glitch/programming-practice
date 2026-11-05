import java.util.Scanner;

public class PrintOddNumbers1ToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i += 2) {
            System.out.println(i);
        }

        scanner.close();
    }
}
