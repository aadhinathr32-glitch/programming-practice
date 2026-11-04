import java.util.Scanner;

public class TriangleValidity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side length 1: ");
        int l1 = scanner.nextInt();

        System.out.print("Enter side length 2: ");
        int l2 = scanner.nextInt();

        System.out.print("Enter side length 3: ");
        int l3 = scanner.nextInt();

        if (l1 > 0 && l2 > 0 && l3 > 0
                && l1 + l2 > l3
                && l2 + l3 > l1
                && l1 + l3 > l2) {
            System.out.println("Valid triangle");
        } else {
            System.out.println("Invalid triangle");
        }

        scanner.close();
    }
}
