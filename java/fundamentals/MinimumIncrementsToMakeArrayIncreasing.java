import java.util.Scanner;

public class MinimumIncrementsToMakeArrayIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of digits to be compared : ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.print("Enter the digits : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int total = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] <= nums[i - 1]) {
                int newValue = nums[i - 1] + 1;
                total += newValue - nums[i];
                nums[i] = newValue;
            }
        }

        System.out.println(total);

        sc.close();
    }
}
