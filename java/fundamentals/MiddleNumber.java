import java.util.Scanner;

public class MiddleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter number 2: ");
        int n2 = scanner.nextInt();

        System.out.print("Enter number 3: ");
        int n3 = scanner.nextInt();

        if ((n1 < n2 && n1 > n3) || (n1 > n2 && n1 < n3)) {
            System.out.println("n1 is the middle number");
        } else if ((n2 < n1 && n2 > n3) || (n2 > n1 && n2 < n3)) {
            System.out.println("n2 is the middle number");
        } else {
            System.out.println("n3 is the middle number");
        }

        scanner.close();
    }
}
