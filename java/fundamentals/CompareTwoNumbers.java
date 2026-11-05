import java.util.Scanner;

public class CompareTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter number 2: ");
        int n2 = scanner.nextInt();

        if (n1 == n2) {
            System.out.println("Both are equal");
        } else {
            if (n1 > n2) {
                System.out.println("Number 1 is the largest");
            } else {
                System.out.println("Number 2 is the largest");
            }
        }

        scanner.close();
    }
}
