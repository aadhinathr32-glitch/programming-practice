import java.util.Scanner;

public class DivisibilityByThreeAndFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Divisible by both");
        } else if (num % 3 == 0) {
            System.out.println("Divisible by 3");
        } else if (num % 5 == 0) {
            System.out.println("Divisible by 5");
        } else {
            System.out.println("Not divisible");
        }

        scanner.close();
    }
}
