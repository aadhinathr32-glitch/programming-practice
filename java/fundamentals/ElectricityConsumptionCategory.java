import java.util.Scanner;

public class ElectricityConsumptionCategory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your electricity consumption: ");
        int consumption = scanner.nextInt();

        if (consumption < 0) {
            System.out.println("Invalid");
        } else if (consumption >= 0 && consumption <= 100) {
            System.out.println("Low consumption");
        } else if (consumption >= 101 && consumption <= 300) {
            System.out.println("Medium consumption");
        } else {
            System.out.println("High consumption");
        }

        scanner.close();
    }
}
