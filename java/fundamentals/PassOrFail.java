import java.util.Scanner;

/**
 * Determines pass or fail based on three subject marks.
 */
public class PassOrFail {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter subject 1 marks: ");
            int sub1 = scanner.nextInt();

            System.out.print("Enter subject 2 marks: ");
            int sub2 = scanner.nextInt();

            System.out.print("Enter subject 3 marks: ");
            int sub3 = scanner.nextInt();

            if (sub1 >= 40 && sub2 >= 40 && sub3 >= 40) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        }
    }
}
