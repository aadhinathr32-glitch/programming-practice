import java.util.Scanner;

public class SalaryBonusCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        int salary = scanner.nextInt();

        System.out.print("Enter your experience: ");
        int experience = scanner.nextInt();

        if (salary < 0 || experience < 0) {
            System.out.println("Invalid input");
        } else if (experience >= 5) {
            int bonusPercentage;

            if (salary >= 50000) {
                bonusPercentage = 20;
            } else {
                bonusPercentage = 10;
            }

            double bonusAmount = salary * bonusPercentage / 100.0;
            System.out.println(bonusPercentage);
            System.out.println(bonusAmount);
        } else {
            int bonusPercentage;

            if (salary >= 50000) {
                bonusPercentage = 10;
            } else {
                bonusPercentage = 5;
            }

            double bonusAmount = salary * bonusPercentage / 100.0;
            System.out.println(bonusPercentage);
            System.out.println(bonusAmount);
        }

        scanner.close();
    }
}
