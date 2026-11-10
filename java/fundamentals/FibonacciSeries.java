import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int num = scanner.nextInt();

        int first = 0;
        int second = 1;

        if (num <= 0) {
            System.out.println("Enter a positive number of terms");
        } else {
            for (int i = 0; i < num; i++) {
                System.out.print(first + " ");
                int nextNumber = first + second;
                first = second;
                second = nextNumber;
            }

            System.out.println();
        }

        scanner.close();
    }
}
